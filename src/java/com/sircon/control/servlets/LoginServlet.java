package com.sircon.control.servlets;

import com.sircon.control.dto.RptaLoginDTO;
import com.sircon.control.dto.UsuarioDTO;
import com.sircon.modelo.service.UsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    
    private UsuarioService servicio;

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
           
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("pass");
        UsuarioDTO usuarioLogin = new UsuarioDTO(usuario, password);
        
        servicio = new UsuarioService();
        RptaLoginDTO rptaLogin = servicio.autenticar(usuarioLogin);
        
        String pagDestino;
        if("00".equals(rptaLogin.getCodigo())){
            pagDestino = "/bienvenida.jsp";
        }else
            pagDestino = "/index.jsp";
        request.setAttribute("resultado", rptaLogin);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(pagDestino);
        dispatcher.forward(request, response);
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

}
