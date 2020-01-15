package com.sircon.modelo.dao.implement;

import com.sircon.modelo.dao.DAOBaseI;
import com.sircon.modelo.entidades.Horario;
import com.sircon.modelo.util.JDBCSircon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HorarioDAO implements  DAOBaseI<Horario, Long>{
    
    private JDBCSircon jdbc;

    public HorarioDAO() {
        this.jdbc = new JDBCSircon();
    }

    @Override
    public void insertar(Horario object) {
        String sql = "INSERT INTO horario (dia, horaInicio, horaFin) values (?, ?, ?)";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getDia());
            ps.setDate(2, (Date) object.getHoraInicio());
            ps.setDate(3, (Date) object.getHoraFin());
        } catch (SQLException e) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Horario Creado");
        jdbc.cerrarObjetos();
    }

    @Override
    public void modificar(Horario object) {
        String sql = "UPDATE horario SET dia = ?, horaInicio = ?, horaFin = ? WHERE codHorario = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setString(1, object.getDia());
            ps.setDate(2, (Date) object.getHoraInicio());
            ps.setDate(3, (Date) object.getHoraFin());
            ps.setInt(4, object.getCodHorario());
        } catch (SQLException e) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Horario: actualizado correctamente");
        jdbc.cerrarObjetos();
         }

    @Override
    public void eliminar(Long codHorario) {
        String sql = "DELETE FROM horario WHERE codHorario = ? ";
        PreparedStatement ps = jdbc.getSentencia(sql);
        try {
            ps.setLong(1, codHorario);
            jdbc.ejecutarActualizacion(ps);
        } catch (SQLException e) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Horario Elminado correctamente");
        jdbc.cerrarObjetos();
    }

    @Override
    public List<Horario> obtenerTodos() {
        String sql = "SELECT * FROM horario";
        PreparedStatement ps = jdbc.getSentencia(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<Horario> resultado = new ArrayList<Horario>();
        Horario objEncontrado = null;
        try {
            while (rs.next()){
                objEncontrado = new Horario();
                objEncontrado.setCodHorario(rs.getInt("codHorario"));
                objEncontrado.setDia(rs.getString("dia"));
                objEncontrado.setHoraInicio(rs.getDate("horaInicio"));
                objEncontrado.setHoraFin(rs.getDate("horaFin"));
                resultado.add(objEncontrado);
            }
        } catch (SQLException e) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Horarios Encontrados: ");
        System.out.println(resultado);
        jdbc.cerrarObjetos();
        return resultado;
    }

    @Override
    public Horario obtener(Long codHorario) {
        String sql = "SELECT * FROM horario WHERE codHorario = ?";
        PreparedStatement ps = jdbc.getSentencia(sql);
        
        Horario objEncontrado = null;
        try {
            ps.setLong(1, codHorario);
            ResultSet rs = jdbc.ejecutarConsulta(ps);
            rs.next();
                objEncontrado = new Horario();
                objEncontrado.setCodHorario(rs.getInt("codHorario"));
                objEncontrado.setDia(rs.getString("dia"));
                objEncontrado.setHoraInicio(rs.getDate("horaInicio"));
                objEncontrado.setHoraFin(rs.getDate("horaFin"));
                
        } catch (SQLException e) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("Horario encontrado con el codigo: "+codHorario);
        System.out.println(objEncontrado);
        jdbc.cerrarObjetos();
        return objEncontrado;
    
    }
}
