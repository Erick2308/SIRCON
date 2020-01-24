package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Administrativo extends Usuario {

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
    public String fechaIngreso;

    /**
     * 
     */
    public String fechaSalida;

    /**
     * 
     */
    public float sueldo;

    /**
     * 
     */
    public String profesion;
    
    public Integer Usuario_Dni;
    
    
    public Administrativo() {
    }

    public Administrativo(String codAdministrativo, String cargo, String fechaIngreso, String fechaSalida, float sueldo, String profesion, Integer Usuario_Dni) {
        this.codAdministrativo = codAdministrativo;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.sueldo = sueldo;
        this.profesion = profesion;
        this.Usuario_Dni = Usuario_Dni;
    }
    
    

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

    public Integer getUsuario_Dni() {
        return Usuario_Dni;
    }

    public void setUsuario_Dni(Integer Usuario_Dni) {
        this.Usuario_Dni = Usuario_Dni;
    }
    
    

    
}