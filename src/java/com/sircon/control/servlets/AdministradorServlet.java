/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sircon.control.servlets;

import com.sircon.modelo.entidades.Administrativo;
import com.sircon.modelo.entidades.Alumno;
import com.sircon.modelo.entidades.Profesor;
import com.sircon.modelo.entidades.Sede;
import com.sircon.modelo.service.AdministrativosService;
import com.sircon.modelo.service.AlumnosService;
import com.sircon.modelo.service.ProfesoresService;
import com.sircon.modelo.service.SedesService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erick Meza
 */
@WebServlet(name = "AdministradorServlet", urlPatterns = {"/Administrador"})
public class AdministradorServlet extends HttpServlet {
    
    AdministrativosService servicioAdministrativo;
    AlumnosService servicioAlumno;
    ProfesoresService servicioProfesor;
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
        System.out.println("Accion: "+accion);
        
        servicioAdministrativo = new AdministrativosService();
        servicioAlumno = new AlumnosService();
        servicioProfesor = new ProfesoresService();
        servicioSede = new SedesService();
        
        switch(accion){
            case "listaSedes":
                listarSedes(request, response);
                break;
            case "listaAlumnos":
                listarAlumnos(request, response);
                break;
            case "listaProfesores":
                listarProfesores(request, response);
                break;
            case "listaAdministradores":
                listarAdministradores(request, response);
                break;
            default:
                listarSedes(request, response);
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

    private void listarSedes (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Administrativo/ListaSedes.jsp");
        List<Sede> sedes = servicioSede.listarTodo();
        request.setAttribute("listaS", sedes);
        dispatcher.forward(request, response);
    }
    
    private void listarAlumnos (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Administrativo/ListaAlumnos.jsp");
        List<Alumno> alumnos = servicioAlumno.listarTodoAL();
        request.setAttribute("listaAL", alumnos);
        dispatcher.forward(request, response);
    }
    
    private void listarProfesores (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Administrativo/ListaProfesores.jsp");
        List<Profesor> profesores = servicioProfesor.listarTodoP();
        request.setAttribute("listaP", profesores);
        dispatcher.forward(request, response);
    }
    
    private void listarAdministradores (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Modulos/Administrativo/ListaAdministradores.jsp");
        List<Administrativo> administrador = servicioAdministrativo.listarTodoAD();
        request.setAttribute("listaAD", administrador);
        dispatcher.forward(request, response);
    }
    
}
