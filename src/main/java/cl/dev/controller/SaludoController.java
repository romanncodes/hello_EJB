/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dev.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//importaciones para injectar el sessionbean
import javax.ejb.EJB;
import cl.dev.ejb.ServicioSaludoLocal;

/**
 *
 * @author roman
 */
@WebServlet(name = "SaludoController", urlPatterns = {"/saludo"})
public class SaludoController extends HttpServlet {

    @EJB
    private ServicioSaludoLocal servicio;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String nombre = request.getParameter("txt");
        
        if(nombre.isEmpty()){
            request.setAttribute("msg", servicio.hello());
        }else{
            request.setAttribute("msg", servicio.hello(nombre));
        }
        
        request.getRequestDispatcher("saludo.jsp").forward(request, response);
        
    }//end dopost

    
}//end servlet
