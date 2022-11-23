package com.webappdemo.controller;

import com.webappdemo.model.GestorPeliculas;
import com.webappdemo.model.Pelicula;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ESTE ES UNO DE LOS CONTROLADORES
@WebServlet(name = "PeliculasServlet", urlPatterns = {"/PeliculasServlet"})
public class PeliculasServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        if (request.getParameter("accion").equals("findAll")){
            //El usuario desea todas las películas
            GestorPeliculas gp = new GestorPeliculas();
            List<Pelicula> pelis = gp.findAll();
            request.setAttribute("pelis", pelis);
            if (Math.random()>0.5f){
                request.getRequestDispatcher("listapeliculas.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("listapeliculas_movil.jsp").forward(request, response);
            }  
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

}
