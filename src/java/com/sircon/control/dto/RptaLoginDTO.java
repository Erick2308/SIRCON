/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sircon.control.dto;

/**
 *
 * @author Erick Meza
 */
public class RptaLoginDTO {
    
    private String codigo;
    private String mensaje;
    
    public RptaLoginDTO(String codigo, String mensaje){
        
        this.codigo = codigo;
        this.mensaje = mensaje;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
    
    
}
