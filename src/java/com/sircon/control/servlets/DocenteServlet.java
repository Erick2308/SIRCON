/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sircon.control.servlets;

import com.sircon.modelo.entidades.Alumno;
import com.sircon.modelo.entidades.Curso;
import com.sircon.modelo.entidades.Nota;
import com.sircon.modelo.entidades.Sede;
import com.sircon.modelo.service.AlumnosService;
import com.sircon.modelo.service.CursosServices;
import com.sircon.modelo.service.NotasService;
import com.sircon.modelo.service.SedesService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Erick Meza
 */
public class DocenteServlet extends HttpServlet {
    
    NotasService servicioNotas;    
    CursosServices servicioCurso;
    AlumnosService servicioAlumno;
    SedesService servicioSede;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        System.out.println("Accion encontrada: " +accion);
        servicioCurso = new CursosServices();
        servicioSede = new SedesService();
        switch(accion){
            case "listarTodo":
                listarTodo(request, response);
                break;
            case "agregarNota":
                agregarNota(request, response);
                break;
            case "guardarNota":
                guardarNota(request, response);
                break;
            case "eliminar":
                eliminarNota(request, response);
                break;
            default: 
                listarTodo(request, response);
                break;
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void listarTodo (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Profesor/ListarCursos.jsp");
        List<Sede> sedes = servicioSede.listarTodo();
        request.setAttribute("lista", sedes);
        dispatcher.forward(request, response);
    }
    
    private void agregarNota (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Profesor/AgregarNota.jsp");
        servicioAlumno = new AlumnosService();
        List<Alumno> alumno = servicioAlumno.listarTodoAL();
        servicioCurso = new CursosServices();
        List<Curso> curso = servicioCurso.listarTodoCurso();
        HttpSession misession = request.getSession(true);
        misession.setAttribute("alumno", alumno);
        misession.setAttribute("curso", curso);
        dispatcher.forward(request, response);
    }
    
    private void guardarNota(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        Nota notas = new Nota();
        String nota = request.getParameter("nota");
        String comentario = request.getParameter("comentario");
        Integer codCurso = Integer.valueOf(request.getParameter("curso"));
        System.out.println("Codigo curso obtenido: "+codCurso);
        Curso curso = new Curso(codCurso);
        notas.setCurso(curso);             
        Integer codAlumno = Integer.valueOf(request.getParameter("alumno"));
        System.out.println("Codigo alumno: " +codAlumno);
        Alumno alumno = new Alumno();
        notas.setAlumno(alumno);
        servicioNotas.crearNota(notas);
        response.sendRedirect("Docente?accion=listarTodo");
    }private void eliminarNota (HttpServletRequest request, HttpServletResponse response) throws IOException {

        String idNotaEliminar = request.getParameter("id");
        System.out.println("funcion a eliminar : " + idNotaEliminar);
        servicioNotas.eliminarNota(Long.valueOf(idNotaEliminar));
        response.sendRedirect("Funciones?accion=listarTodo");
    }
}
