package com.sircon.modelo.service;

import com.sircon.modelo.dao.implement.NotasDAO;
import com.sircon.modelo.entidades.Nota;
import java.util.List;

/**
 *
 * @author Erick Meza
 */
public class NotasService {
    
    private NotasDAO dao;
    
    public NotasService(){
        this.dao = new NotasDAO();
    }
    
    public List<Nota> listarTodoNot(){
        return dao.obtenerTodos();
        
    }
    
    public void eliminarNota(Long id){
        dao.eliminar(id);
    }
    
    public void actualizarNota(Nota Notas){
        dao.modificar(Notas);
    }
    
    public Nota buscarPorID(Long id){
        return dao.obtener(id);
    }
    
    public void crearNota(Nota notas){
        dao.insertar(notas);
    }
    
}
