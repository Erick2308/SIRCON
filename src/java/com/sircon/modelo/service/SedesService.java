/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.SedeDAO;
import com.sircon.modelo.entidades.Sede;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class SedesService {
    
    private SedeDAO dao;
    
    public SedesService(){
        
        dao = new SedeDAO();
    }
    
    public List<Sede> listarTodo(){
    
    return dao.obtenerTodos();
}

    
}
