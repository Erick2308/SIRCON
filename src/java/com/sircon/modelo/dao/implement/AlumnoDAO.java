package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Alumno;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoDAO implements DAOBaseI<Alumno, Long> {

    private JDBCSircon jdbc;

    public AlumnoDAO() {
        this.jdbc = new JDBCSircon();
    }

        @Override
        public void insertar(Alumno object ) {
        String sql = "INSERT INTO alumno (estado, fechaInscripcion, fechaSalida, Usuario_usuario) values (?, ?, ?, ?)";
            PreparedStatement ps = jdbc.getSentencia(sql);
            try {
                ps.setString(1, object.getEstado());
                ps.setString(2, object.getFechaInscripcion());
                ps.setString(3, object.getFechaSalida());
                ps.setString(4, object.getUsuario());
            } catch (SQLException e) {
                Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println("Alumno Creado");
            jdbc.cerrarObjetos();
        }

        @Override
        public void modificar(Alumno object) {            
        String sql = "UPDATE alumno SET estado = ?, fechaInscripcion = ?, fechaSalida= ? WHERE Usuario_dni = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getEstado());
            ps.setString(2, object.getFechaInscripcion());
            ps.setString(3, object.getFechaSalida());
            ps.setInt(4, object.getDni());
        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Alumno :"+object.getUsuario()+" actualizado correctamente");
        jdbc.cerrarObjetos();
        
        }

        @Override
        public void eliminar(Long dni) {            
        String sql = "DELETE FROM alumno WHERE Usuario_dni = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, dni);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("alumno: " + dni + "Elminado correctamente");
        jdbc.cerrarObjetos();
    }

        @Override
        public List<Alumno> obtenerTodos() {
        String sql = "SELECT * FROM alumno";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Alumno> resultado = new ArrayList<Alumno>();
        Alumno objEncontrado = null;
        try {
            while (rs.next()) {
                objEncontrado = new Alumno();
                objEncontrado.setCodAlumno(rs.getInt("codAlumno"));
                objEncontrado.setFechaInscripcion(rs.getString("fechaInscripcion"));
                objEncontrado.setFechaSalida(rs.getString("fechaSalida"));
                objEncontrado.setEstado(rs.getString("estado"));
                objEncontrado.setUsuario_dni(rs.getInt("Usuario_dni"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println(" Estudiantes encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    }

        @Override
        public Alumno obtener(Long dni) {
        String sql = "SELECT * FROM alumno WHERE Usuario_dni = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);

        Alumno objEncontrado = null;
        try {
            ps.setLong(1, dni);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            objEncontrado.setCodAlumno(rs.getInt("codAlumno"));
            objEncontrado.setFechaInscripcion(rs.getString("fechaInscripcion"));
            objEncontrado.setFechaSalida(rs.getString("fechaSalida"));
            objEncontrado.setEstado(rs.getString("estado"));
            objEncontrado.setUsuario_dni(rs.getInt("Usuario_dni"));
            rs.next();
            objEncontrado = new Alumno();
            
        } catch (SQLException e) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println("Alumno encontrado con dni: " + dni);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    }

    }

