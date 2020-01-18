/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sircon.control.servlets;

import com.sircon.modelo.entidades.Administrativo;
import com.sircon.modelo.entidades.Alumno;
import com.sircon.modelo.entidades.Profesor;
import com.sircon.modelo.service.AdministrativoService;
import com.sircon.modelo.service.AlumnoService;
import com.sircon.modelo.service.ProfesorService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erick Meza
 */
public class BuscarServlet extends HttpServlet {

    AdministrativoService servicioAdministrativo;
    AlumnoService servicioAlumno;
    ProfesorService servicioProfesor;

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
        
        String accion = request.getParameter("");
        System.out.println("Accion encontrada: "+ accion);
        servicioAdministrativo = new AdministrativoService();
        
        switch(accion){
            case "administrativos":                
                ListarTodoAdm(request, response);
                break;
            case "alumnos":
                
            case "profesores":
                
            default:
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

    private void ListarTodoAdm (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        List<Administrativo> administrativos = servicioAdministrativo.listarTodoAdm();
        request.setAttribute("listaAdministrativo", administrativos);
        dispatcher.forward(request, response);        
    }
    
    private void ListarTodoAlu (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        List<Alumno> alumnos = servicioAlumno.listarTodoAlu();
        request.setAttribute("listaAlumnos", alumnos);
        dispatcher.forward(request, response);        
    }
    
    private void ListarTodoPro (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        List<Profesor> profesores = servicioProfesor.listarTodoPro();
        request.setAttribute("listaAdministrativo", profesores);
        dispatcher.forward(request, response);        
    }
}
