package com.sircon.modelo.dao;

import java.util.List;

public interface DAOBaseI <T, ID>{
    
    void insertar (T object);
    void modificar (T object);
    void eliminar (ID id);
    List<T> obtenerTodos();
    T obtener(ID id);
}