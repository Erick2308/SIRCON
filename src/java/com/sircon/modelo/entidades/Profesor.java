package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Profesor extends Usuario {

    /**
     * Default constructor
     */
    public Profesor() {
    }

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
    public float sueldo;

    /**
     * 
     */
    public String fechaIngreso;

    /**
     * 
     */
    public String fechaSalida;
    
    public Integer usuario_Dni;

    public Profesor(int codProfesor, String profesion, float sueldo, String fechaIngreso, String fechaSalida, Integer usuario_Dni) {
        this.codProfesor = codProfesor;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.usuario_Dni = usuario_Dni;
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
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

    public Integer getUsuario_Dni() {
        return usuario_Dni;
    }

    public void setUsuario_Dni(Integer usuario_Dni) {
        this.usuario_Dni = usuario_Dni;
    }


}