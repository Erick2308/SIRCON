package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Sede {

    /**
     * Default constructor
     */
    public Sede() {
    }

    /**
     * 
     */
    public int codSede;

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public String direccion;

    /**
     * 
     */
    public int telefono;

    public int getCodSede() {
        return codSede;
    }

    public void setCodSede(int codSede) {
        this.codSede = codSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}