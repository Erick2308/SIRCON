
package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Curso;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CursoDAO implements DAOBaseI<Curso, Long>{
    
    private JDBCSircon jdbc;

    public CursoDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Curso object) {
        String sql = "INSERT INTO cursos (nombre, descripcion, fechaRegistro, ultModificacion, estado, cantHoras) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getNombre());
            ps.setString(2, object.getDescripcion());
            ps.setString(3, object.getFechaRegistro());
            ps.setString(4, object.getUltModificacion());
            ps.setString(5, object.getEstado());
            ps.setInt(6, object.getCantHoras());            
        } catch (SQLException e) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Curso Creado");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Curso object) {
        String sql = "UPDATE cursos SET nombre = ?, descripcion = ?, fechaRegistro = ?, ultModificacion = ?, estado = ?, cantHoras = ? WHERE codCursos = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getNombre());
            ps.setString(2, object.getDescripcion());
            ps.setString(3, object.getFechaRegistro());
            ps.setString(4, object.getUltModificacion());
            ps.setString(5, object.getEstado());
            ps.setInt(6, object.getCantHoras());
            ps.setInt(7, object.getCodCurso());
        } catch (SQLException e) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("curso :"+object.getNombre()+" actualizado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public void eliminar(Long codCursos) {
        String sql = "DELETE FROM cursos WHERE codCursos = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codCursos);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Curso: "+codCursos+"Elminado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public List<Curso> obtenerTodos() {
        String sql = "SELECT * FROM cursos;";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Curso> resultado = new ArrayList<Curso>();
        Curso objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Curso();
                objEncontrado.setCodCurso(rs.getInt("codCurso"));
                objEncontrado.setNombre(rs.getString("nombre"));
                objEncontrado.setDescripcion(rs.getString("descripcion"));
                objEncontrado.setFechaRegistro(rs.getString("fechaRegistro"));
                objEncontrado.setUltModificacion(rs.getString("ultModificacion"));
                objEncontrado.setEstado(rs.getString("estado"));
                objEncontrado.setCantHoras(rs.getInt("cantHoras"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Cursos Encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    
    }

    @Override
    public Curso obtener(Long codCurso) {
        String sql = "SELECT * FROM cursos WHERE codCurso = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Curso objEncontrado = null;
        try {
            ps.setLong(1, codCurso);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Curso();
                objEncontrado.setCodCurso(rs.getInt("codCurso"));
                objEncontrado.setNombre(rs.getString("nombre"));
                objEncontrado.setDescripcion(rs.getString("descripcion"));
                objEncontrado.setFechaRegistro(rs.getString("fechaRegistro"));
                objEncontrado.setUltModificacion(rs.getString("ultModificacion"));
                objEncontrado.setEstado(rs.getString("estado"));
                objEncontrado.setCantHoras(rs.getInt("cantHoras"));    
                
        } catch (SQLException e) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Curso encontrado con el codigo: "+codCurso);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    
    }

}
