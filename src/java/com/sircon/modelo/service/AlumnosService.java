package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.AlumnoDAO;
import com.sircon.modelo.entidades.Alumno;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class AlumnosService {   
    
    private AlumnoDAO dao;
    
    public AlumnosService(){
        
        dao = new AlumnoDAO();
        
    }
    
    public List<Alumno> listarTodoAL(){
        
        return dao.obtenerTodos();
    }
    
}
    

