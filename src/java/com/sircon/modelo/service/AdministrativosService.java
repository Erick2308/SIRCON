package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.AdministrativoDAO;
import com.sircon.modelo.entidades.Administrativo;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class AdministrativosService {
    
    private AdministrativoDAO dao;
    
    public AdministrativosService(){
        
        dao = new AdministrativoDAO();
        
    }
    
    public List<Administrativo> listarTodoAD(){
        
        return dao.obtenerTodos();
    }
    
}
