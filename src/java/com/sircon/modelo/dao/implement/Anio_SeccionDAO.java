package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Anio_Seccion;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Anio_SeccionDAO implements DAOBaseI<Anio_Seccion, Long>{
    
    private JDBCSircon jdbc;

    public Anio_SeccionDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Anio_Seccion object) {
        String sql = "INSERT INTO Seccion (anioSeccion, fechaInicio, fechaFin) values (?, ?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getAnioSeccion());
            ps.setDate(2, (Date) object.getFechaInicio());
            ps.setDate(3, (Date) object.getFechaFin());
        } catch (SQLException e) {
            Logger.getLogger(Anio_SeccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Seccion Creada");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Anio_Seccion object) {
        String sql = "UPDATE seccion SET anioSeccion = ?, fechaInicio = ?, fechaFin = ? WHERE codSeccion = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getAnioSeccion());
            ps.setDate(2, (Date) object.getFechaInicio());
            ps.setDate(3, (Date) object.getFechaFin());
            ps.setLong(4, object.getCodSeccion());
        } catch (SQLException e) {
            Logger.getLogger(Anio_SeccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Seccion :"+object.getAnioSeccion()+" actualizado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void eliminar(Long codSeccion) {
        String sql = "DELETE FROM seccion WHERE codSeccion = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codSeccion);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(Anio_SeccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Usuario: "+codSeccion+"Elminado correctamente");
        jdbc.cerrarObjetos();
    
    }

    @Override
    public List<Anio_Seccion> obtenerTodos() {
        String sql = "SELECT * FROM seccion";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Anio_Seccion> resultado = new ArrayList<Anio_Seccion>();
        Anio_Seccion objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Anio_Seccion();
                objEncontrado.setCodSeccion(rs.getInt("codSeccion"));
                objEncontrado.setAnioSeccion(rs.getString("anioSeccion"));
                objEncontrado.setFechaInicio(rs.getDate("fechaInicio"));
                objEncontrado.setFechaFin(rs.getDate("fechaFin"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(Anio_SeccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Secciones Encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;    
    }

    @Override
    public Anio_Seccion obtener(Long codSeccion) {
        String sql = "SELECT * FROM seccion WHERE codSeccion = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Anio_Seccion objEncontrado = null;
        try {
            ps.setLong(1, codSeccion);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Anio_Seccion();
                objEncontrado.setAnioSeccion(rs.getString("anioSeccion"));
                objEncontrado.setFechaInicio(rs.getDate("fechaInicio"));
                objEncontrado.setFechaFin(rs.getDate("fechaFin"));
                
        } catch (SQLException e) {
            Logger.getLogger(Anio_SeccionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Seccion encontrado con el codigo: "+codSeccion);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    }
    
    
}
