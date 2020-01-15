package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Notas {

    /**
     * Default constructor
     */
    public Notas() {
    }

    /**
     * 
     */
    public int codNota;

    /**
     * 
     */
    public float nota;

    /**
     * 
     */
    public String comentario;

    public int getCodNota() {
        return codNota;
    }

    public void setCodNota(int codNota) {
        this.codNota = codNota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


}