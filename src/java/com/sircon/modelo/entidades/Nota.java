package com.sircon.modelo.entidades;


import java.util.*;

/**
 * 
 */
public class Nota {

    /**
     * Default constructor
     */
    public Nota() {
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
    
    public Curso curso;
    
    public Alumno alumno;

    public Nota(float nota, String comentario, Curso curso, Alumno alumno) {
        super();
        this.nota = nota;
        this.comentario = comentario;
        this.curso = curso;
        this.alumno = alumno;
    }
    
    public Nota(int codNota, float nota, String comentario) {
        this.codNota = codNota;
        this.nota = nota;
        this.comentario = comentario;
    }  
    
    

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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    


}