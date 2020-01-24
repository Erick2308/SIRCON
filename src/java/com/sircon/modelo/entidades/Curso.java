package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Curso {

    /**
     * 
     */
    public Integer codCurso;

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
    public String fechaRegistro;

    /**
     * 
     */
    public String ultModificacion;

    /**
     * 
     */
    public String estado;

    /**
     * 
     */
    public int cantHoras;
    
    public Curso(){
        
    }

    public Curso(Integer codCurso, String nombre, String descripcion, String fechaRegistro, String ultModificacion, String estado, int cantHoras) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.ultModificacion = ultModificacion;
        this.estado = estado;
        this.cantHoras = cantHoras;
    }
    
    
    
    
    
    public Curso(Integer idCurso){
        this.codCurso = idCurso;
    }

 

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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUltModificacion() {
        return ultModificacion;
    }

    public void setUltModificacion(String ultModificacion) {
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