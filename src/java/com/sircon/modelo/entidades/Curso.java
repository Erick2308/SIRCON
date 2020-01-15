package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Curso {

    /**
     * Default constructor
     */
    public Curso() {
    }

    /**
     * 
     */
    public int codCurso;

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public String descripcion;

    /**
     * 
     */
    public Date fechaRegistro;

    /**
     * 
     */
    public Date ultModificacion;

    /**
     * 
     */
    public String estado;

    /**
     * 
     */
    public int cantHoras;

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getUltModificacion() {
        return ultModificacion;
    }

    public void setUltModificacion(Date ultModificacion) {
        this.ultModificacion = ultModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }


}