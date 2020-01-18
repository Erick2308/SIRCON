package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.AlumnoDAO;
import com.sircon.modelo.entidades.Alumno;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class AlumnoService {   
    
    private AlumnoDAO dao;
    
    public AlumnoService(){
        
        dao = new AlumnoDAO();
        
    }
    
    public List<Alumno> listarTodoAlu(){
        
        return dao.obtenerTodos();
    }
    
}
    

