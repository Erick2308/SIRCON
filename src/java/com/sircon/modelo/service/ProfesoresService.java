package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.ProfesorDAO;
import com.sircon.modelo.entidades.Profesor;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class ProfesoresService {
    
    private ProfesorDAO dao;
    
    public ProfesoresService(){
        
        dao = new ProfesorDAO();
        
    }
    
    public List<Profesor> listarTodoP(){
        
        return dao.obtenerTodos();
    }
    
}
