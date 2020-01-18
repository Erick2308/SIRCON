package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.AdministrativoDAO;
import com.sircon.modelo.entidades.Administrativo;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class AdministrativoService {
    
    private AdministrativoDAO dao;
    
    public AdministrativoService(){
        
        dao = new AdministrativoDAO();
        
    }
    
    public List<Administrativo> listarTodoAdm(){
        
        return dao.obtenerTodos();
    }
    
}
