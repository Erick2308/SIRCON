package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Profesor;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProfesorDAO implements DAOBaseI<Profesor, Long>{
    
   private JDBCSircon jdbc;

    public ProfesorDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Profesor object) {
        
        String sql = "INSERT INTO profesor (profesion, sueldo, fechaIngreso, fechaSalida) values (?, ?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getProfesion());
            ps.setFloat(2, object.getSueldo());
            ps.setString(3, object.getFechaIngreso());
            ps.setString(4, object.getFechaSalida());
        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Profesor agregado");
        jdbc.cerrarObjetos();
        
    }

    @Override
    public void modificar(Profesor object) {
        String sql = "UPDATE profesor SET profesion = ?, sueldo = ?, fechaIngreso = ?, fechaSalida = ? WHERE codProfesor = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getProfesion());
            ps.setFloat(2, object.getSueldo());
            ps.setString(3, object.getFechaIngreso());
            ps.setString(4, object.getFechaSalida());
        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Profesor  actualizado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void eliminar(Long codProfesor) {
        String sql = "DELETE FROM profesor WHERE codProfesor = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codProfesor);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Profesor Elminado correctamente");
        jdbc.cerrarObjetos(); 
        
    }

    @Override
    public List<Profesor> obtenerTodos() {
        String sql = "SELECT * FROM nota";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Profesor> resultado = new ArrayList<Profesor>();
        Profesor objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Profesor();
                objEncontrado.setCodProfesor(rs.getInt("codProfesor"));
                objEncontrado.setProfesion(rs.getString("profesion"));
                objEncontrado.setSueldo(rs.getFloat("sueldo"));
                objEncontrado.setFechaIngreso(rs.getString("fechaIngreso"));
                objEncontrado.setFechaSalida(rs.getString("fechaSalida"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Profesores encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;   
    }

    @Override
    public Profesor obtener(Long codProfesor) {
        String sql = "SELECT * FROM profesor WHERE codProfesor = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Profesor objEncontrado = null;
        try {
            ps.setLong(1, codProfesor);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Profesor();
                objEncontrado.setCodProfesor(rs.getInt("codProfesor"));
                objEncontrado.setProfesion(rs.getString("profesion"));
                objEncontrado.setSueldo(rs.getFloat("sueldo"));
                objEncontrado.setFechaIngreso(rs.getString("fechaIngreso"));
                objEncontrado.setFechaSalida(rs.getString("fechaSalida"));
        } catch (SQLException e) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Profesor encontrado con el codigo: "+codProfesor);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;    
    }
    
}
