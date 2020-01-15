package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Administrativo extends Usuario {

    /**
     * Default constructor
     */
    public Administrativo() {
    }

    /**
     * 
     */
    public String codAdministrativo;

    /**
     * 
     */
    public String cargo;

    /**
     * 
     */
    public Date fechaIngreso;

    /**
     * 
     */
    public Date fechaSalida;

    /**
     * 
     */
    public float sueldo;

    /**
     * 
     */
    public String profesion;

    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    public void setCodAdministrativo(String codEmpleado) {
        this.codAdministrativo = codAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
}