package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.CursoDAO;
import com.sircon.modelo.entidades.Curso;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class CursosServices {
    
    private CursoDAO dao;
    
    public CursosServices(){
        
        dao = new CursoDAO();
    }
    
    public List<Curso> listarTodoCurso(){
        return dao.obtenerTodos();
    }
    
}
