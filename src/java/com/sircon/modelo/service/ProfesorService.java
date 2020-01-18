package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.ProfesorDAO;
import com.sircon.modelo.entidades.Profesor;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class ProfesorService {
    
    private ProfesorDAO dao;
    
    public ProfesorService(){
        
        dao = new ProfesorDAO();
        
    }
    
    public List<Profesor> listarTodoPro(){
        
        return dao.obtenerTodos();
    }
    
}
