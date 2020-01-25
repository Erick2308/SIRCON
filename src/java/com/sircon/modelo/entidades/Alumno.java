package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Alumno extends Usuario {

    
    
    public int codAlumno;

    /**
     * 
     */
    public String Usuario;

    /**
     * 
     */
    public String fechaInscripcion;

    /**
     * 
     */
    public String fechaSalida;

    /**
     * 
     */
    public String estado;
    
    public int Usuario_dni;
    
    public Alumno() {
    }

    public Alumno(int codAlumno, String Usuario, String fechaInscripcion, String fechaSalida, String estado, int Usuario_dni) {
        this.codAlumno = codAlumno;
        this.Usuario = Usuario;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.Usuario_dni = Usuario_dni;
    }


    

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    public int getUsuario_dni() {
        return Usuario_dni;
    }

    public void setUsuario_dni(int Usuario_dni) {
        this.Usuario_dni = Usuario_dni;
    }
    
    


}