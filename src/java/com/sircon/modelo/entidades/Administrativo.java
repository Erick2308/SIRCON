package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Administrativo extends Usuario {

    /**
     * 
     */
    public int codAdministrativo;

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
    public int sueldo;

    /**
     * 
     */
    public String profesion;
    
    public int Usuario_Dni;
    
    
    public Administrativo() {
    }

    public Administrativo(int codAdministrativo, String cargo, String fechaIngreso, String fechaSalida, int sueldo, String profesion, int Usuario_Dni) {
        this.codAdministrativo = codAdministrativo;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.sueldo = sueldo;
        this.profesion = profesion;
        this.Usuario_Dni = Usuario_Dni;
    }
    
    

    public int getCodAdministrativo() {
        return codAdministrativo;
    }

    public void setCodAdministrativo(int codEmpleado) {
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

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getUsuario_Dni() {
        return Usuario_Dni;
    }

    public void setUsuario_Dni(int Usuario_Dni) {
        this.Usuario_Dni = Usuario_Dni;
    }
    
    

    
}