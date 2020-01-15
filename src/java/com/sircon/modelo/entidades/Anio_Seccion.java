package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Anio_Seccion {

    /**
     * Default constructor
     */
    public Anio_Seccion() {
    }

    /**
     * 
     */
    public int codSeccion;
    
    public String anioSeccion;

    /**
     * 
     */
    public Date fechaInicio;

    /**
     * 
     */
    public Date fechaFin;

    public int getCodSeccion() {
        return codSeccion;
    }

    public void setCodSeccion(int codSeccion) {
        this.codSeccion = codSeccion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getAnioSeccion() {
        return anioSeccion;
    }

    public void setAnioSeccion(String anioSeccion) {
        this.anioSeccion = anioSeccion;
    }
    
    





}