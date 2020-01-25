package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Profesor {

   
    /**
     * 
     */
    public int codProfesor;

    /**
     * 
     */
    public String profesion;

    /**
     * 
     */
    public int sueldo;

    /**
     * 
     */
    public String fechaIngreso;

    /**
     * 
     */
    public String fechaSalida;
    
    public int Usuario_dni;
    
    public Profesor() {
    }

    public Profesor(int codProfesor, String profesion, int sueldo, String fechaIngreso, String fechaSalida, int Usuario_dni) {
        this.codProfesor = codProfesor;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.Usuario_dni = Usuario_dni;
    }   
    
    public int getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getUsuario_dni() {
        return Usuario_dni;
    }

    public void setUsuario_dni(int Usuario_dni) {
        this.Usuario_dni = Usuario_dni;
    }


}