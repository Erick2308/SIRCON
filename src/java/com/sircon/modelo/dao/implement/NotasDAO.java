package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Nota;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NotasDAO implements DAOBaseI<Nota, Long>{
    
    private JDBCSircon jdbc;

    public NotasDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Nota object) {        
        String sql = "INSERT INTO nota (nota, comentario) values (?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setFloat(1, object.getNota());
            ps.setString(2, object.getComentario());
        } catch (SQLException e) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Nota agregada");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Nota object) {
        String sql = "UPDATE nota SET nota = ?, comentario = ? WHERE codNota = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setFloat(1, object.getNota());
            ps.setString(2, object.getComentario());
            ps.setInt(3, object.getCodNota());
        } catch (SQLException e) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Nota: actualizado correctamente");
        jdbc.cerrarObjetos();
    
    }

    @Override
    public void eliminar(Long codNota) {
        String sql = "DELETE FROM nota WHERE codNota = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codNota);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Nota Elminada correctamente");
        jdbc.cerrarObjetos();   
    }

    @Override
    public List<Nota> obtenerTodos() {
        String sql = "SELECT * FROM nota";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Nota> resultado = new ArrayList<Nota>();
        Nota objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Nota();
                objEncontrado.setCodNota(rs.getInt("codNota"));
                objEncontrado.setNota(rs.getFloat("nota"));
                objEncontrado.setComentario(rs.getString("comentario"));
                objEncontrado.setCursos_codCursos(rs.getInt("Cursos_codCursos"));
                objEncontrado.setAlumno_codAlumno(rs.getInt("Alumno_codAlumno"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Notas encontradas: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    
    }

    @Override
    public Nota obtener(Long codNota) {
        String sql = "SELECT * FROM nota WHERE codNota = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Nota objEncontrado = null;
        try {
            ps.setLong(1, codNota);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Nota();
                objEncontrado.setCodNota(rs.getInt("codNota"));
                objEncontrado.setNota(rs.getFloat("nota"));
                objEncontrado.setComentario(rs.getString("comentario"));
                
        } catch (SQLException e) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Nota encontrado con el codigo: "+codNota);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;      
    
    }
    
    
}
