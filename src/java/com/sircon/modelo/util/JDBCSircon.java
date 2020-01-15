package com.sircon.modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCSircon {
    
    private final String user = "root";
    private final String pass = "SirconVS20++";
    private final String url = "jdbc:mysql://localhost:3306/sircon?serverTimezone=UTC";
    private final String driverclass = "com.mysql.jdbc.Driver";
    
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    
    public JDBCSircon(){
        try {
            Class.forName(driverclass);
            conexion = DriverManager.getConnection(url,user,pass);
            if (conexion !=null) {
                System.out.println("Conexion a la BD Exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(JDBCSircon.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public PreparedStatement getSentencia(String sql){
        
        try {
            sentencia = conexion.prepareStatement(sql);
        } catch (SQLException e) {
            Logger.getLogger(JDBCSircon.class.getName()).log(Level.SEVERE, null, e);
        }
        return sentencia;
    }
    
    public ResultSet ejecutarConsulta(PreparedStatement statementSQL){
        sentencia = statementSQL;
        
        try {
            resultado = sentencia.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(JDBCSircon.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultado;
    }
    
    public void ejecutarActualizacion (PreparedStatement statementSQL){
        sentencia = statementSQL;
        
        try {
            sentencia.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(JDBCSircon.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void cerrarObjetos(){
        try {
            if (sentencia != null)
                sentencia.close();
            if (conexion != null) 
                conexion.close();
            if (resultado != null)
                resultado.close();
        } catch (SQLException e) {
            Logger.getLogger(JDBCSircon.class.getName()).log(Level.SEVERE, null, e);
        }
    }   
    
}
