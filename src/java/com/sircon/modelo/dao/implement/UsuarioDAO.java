package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Usuario;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements DAOBaseI<Usuario, Long> {

    private JDBCSircon jdbc;

    public UsuarioDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Usuario object) {
        String sql = "INSERT INTO usuario (dni, usuario, password, nombres, apellidoPaterno, apellidoMaterno, direccion, numContacto, email) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setInt(1, object.getDni());
            ps.setString(2, object.getUsuario());
            ps.setString(3, object.getPassword());
            ps.setString(4, object.getNombres());
            ps.setString(5, object.getApellidoPaterno());
            ps.setString(6, object.getApellidoMaterno());
            ps.setString(7, object.getDireccion());
            ps.setInt(8, object.getNumContacto());
            ps.setString(9, object.getEmail());

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Usuario agregado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Usuario object) {
        String sql = "UPDATE usuario SET usuario = ?, password = ?, nombres = ?, apellidoPaterno = ?, apellidoMaterno = ?, direccion = ?, numContacto = ?, email = ? WHERE dni = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getUsuario());
            ps.setString(2, object.getPassword());
            ps.setString(3, object.getNombres());
            ps.setString(4, object.getApellidoPaterno());
            ps.setString(5, object.getApellidoMaterno());
            ps.setString(6, object.getDireccion());
            ps.setInt(7, object.getNumContacto());
            ps.setString(8, object.getEmail());
            ps.setInt(9, object.getDni());

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Usuario actualizado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void eliminar(Long dni) {
        String sql = "DELETE FROM usuario WHERE dni = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, dni);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Usuario Elminado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public List<Usuario> obtenerTodos() {

        String sql = "SELECT * FROM sede";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Usuario> resultado = new ArrayList<Usuario>();
        Usuario objEncontrado = null;
        try {
            while (rs.next()) {
                objEncontrado = new Usuario();
                objEncontrado.setDni(rs.getInt("dni"));
                objEncontrado.setUsuario(rs.getString("usuario"));
                objEncontrado.setPassword(rs.getString("password"));
                objEncontrado.setNombres(rs.getString("nombres"));
                objEncontrado.setApellidoPaterno(rs.getString("apellidoPaterno"));
                objEncontrado.setApellidoMaterno(rs.getString("apellidoMaterno"));
                objEncontrado.setDireccion(rs.getString("direccion"));
                objEncontrado.setNumContacto(rs.getInt("numContacto"));
                objEncontrado.setEmail(rs.getString("email"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println("usuarios encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    }

    @Override
    public Usuario obtener(Long dni) {
        String sql = "SELECT * FROM usuario WHERE dni = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);

        Usuario objEncontrado = null;
        try {
            ps.setLong(1, dni);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
            objEncontrado = new Usuario();
            objEncontrado.setUsuario(rs.getString("usuario"));
            objEncontrado.setPassword(rs.getString("password"));
            objEncontrado.setNombres(rs.getString("nombres"));
            objEncontrado.setApellidoPaterno(rs.getString("apellidoPaterno"));
            objEncontrado.setApellidoMaterno(rs.getString("apellidoMaterno"));
            objEncontrado.setDireccion(rs.getString("direccion"));
            objEncontrado.setNumContacto(rs.getInt("numContacto"));
            objEncontrado.setEmail(rs.getString("email"));
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println("Usuario encontrado con dni: " + dni);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    }

    public Usuario buscarUsuario(String usuario) {
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        Usuario objEncontrado = null;
        try {
            ps.setString(1, usuario);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            if (rs.next()) {
                objEncontrado = new Usuario();
                objEncontrado.setDni(rs.getInt("dni"));
                objEncontrado.setUsuario(rs.getString("usuario"));
                objEncontrado.setPassword(rs.getString("password"));
                
                System.out.println("Usuario encontrado con : "+usuario);
                System.out.println(objEncontrado);
            }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);            
        }
        
        jdbc.cerrarObjetos();
        return objEncontrado;
    }
    
    

}
