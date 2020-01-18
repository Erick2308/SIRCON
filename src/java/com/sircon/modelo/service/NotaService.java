package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.NotasDAO;
import com.sircon.modelo.entidades.Notas;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class NotaService {
    
    private NotasDAO dao;
    
    public NotaService(){
        this.dao = new NotasDAO();
    }
    
    public List<Notas> listarTodoNot(){
        return dao.obtenerTodos();
        
    }
    
    public void eliminarNota(Long id){
        dao.eliminar(id);
    }
    
    public void actualizarNota(Notas Notas){
        dao.modificar(Notas);
    }
    
    public Notas buscarPorID(Long id){
        return dao.obtener(id);
    }
    
    public void crearNota(Notas notas){
        dao.insertar(notas);
    }
    
}
