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
    
    public int Cursos_codCursos;
    public int Alumno_codAlumno;

    public Nota(int codNota, float nota, String comentario, int Cursos_codCursos, int Alumno_codAlumno) {
        this.codNota = codNota;
        this.nota = nota;
        this.comentario = comentario;
        this.Cursos_codCursos = Cursos_codCursos;
        this.Alumno_codAlumno = Alumno_codAlumno;
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

    public int getCursos_codCursos() {
        return Cursos_codCursos;
    }

    public void setCursos_codCursos(int Cursos_codCursos) {
        this.Cursos_codCursos = Cursos_codCursos;
    }

    public int getAlumno_codAlumno() {
        return Alumno_codAlumno;
    }

    public void setAlumno_codAlumno(int Alumno_codAlumno) {
        this.Alumno_codAlumno = Alumno_codAlumno;
    }
    
    
    
    


}