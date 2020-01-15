package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Sede;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SedeDAO implements DAOBaseI<Sede, Long>{
    
    private JDBCSircon jdbc;
    
    public SedeDAO(JDBCSircon instanciaJDBC){
        this.jdbc = instanciaJDBC;
    }

    @Override
    public void insertar(Sede object) {
        String sql = "INSERT INTO sede (nombre, direccion, telefono) values (?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getNombre());
            ps.setString(2, object.getDireccion());
            ps.setInt(3, object.getTelefono());
        } catch (SQLException e) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Sede agregada correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Sede object) {
        
        String sql = "UPDATE sede SET nombre = ?, direccion = ?, telefono = ? WHERE codSede = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getNombre());
            ps.setString(2, object.getDireccion());
            ps.setInt(3, object.getTelefono());
            ps.setInt(4, object.getCodSede());
        } catch (SQLException e) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Sede  actualizada correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void eliminar(Long codSede) {
        
        String sql = "DELETE FROM sede WHERE codSede = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codSede);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Sede Elminada correctamente");
        jdbc.cerrarObjetos(); 
    }

    @Override
    public List<Sede> obtenerTodos() {
        String sql = "SELECT * FROM sede";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Sede> resultado = new ArrayList<Sede>();
        Sede objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Sede();
                objEncontrado.setCodSede(rs.getInt("codSede"));
                objEncontrado.setNombre(rs.getString("nombre"));
                objEncontrado.setDireccion(rs.getString("direccion"));
                objEncontrado.setTelefono(rs.getInt("telefono"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Sedes encontradas: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    }

    @Override
    public Sede obtener(Long codSede) {
        String sql = "SELECT * FROM profesor WHERE codSede = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Sede objEncontrado = null;
        try {
            ps.setLong(1, codSede);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Sede();
                objEncontrado.setCodSede(rs.getInt("codSede"));
                objEncontrado.setNombre(rs.getString("nombre"));
                objEncontrado.setDireccion(rs.getString("direccion"));
                objEncontrado.setTelefono(rs.getInt("telefono"));
        } catch (SQLException e) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Sede encontrada con el codigo: "+codSede);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    }
}
