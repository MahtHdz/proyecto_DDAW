/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import MetodosBD.ActualizarTarjetaCRC;
import MetodosBD.GuardarTarjeta;
import Pojos.TablaTCRC;
import Pojos.TarjetaCRC;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maht_
 */
@WebServlet(name = "EditCard", urlPatterns = {"/EditCard"})
public class EditCard extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Entramos al servlet");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insertando Tarjeta</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String clase = request.getParameter("class");
            System.out.println("Clase: "+ clase);
            String superClasses = request.getParameter("super_classes");
            System.out.println("Clase: "+ superClasses);
            String subClasses = request.getParameter("sub_classes");
            System.out.println("Clase: "+ subClasses);
            
            String[] tablaCRC_responsabilidades = request.getParameterValues("responsabilidad");
//            ArrayList<String> responsabilidades = new ArrayList<String>(Arrays.asList(tablaCRC_responsabilidades));
            
            String[] tablaCRC_colaboradores = request.getParameterValues("colaborador");
//            ArrayList<String> colaboradores = new ArrayList<String>(Arrays.asList(tablaCRC_colaboradores));
            
            List<TablaTCRC> tabla = new ArrayList<TablaTCRC>();
            for(int i=0; i<tablaCRC_responsabilidades.length; i++){
                String responsabilidad = tablaCRC_responsabilidades[i];
                System.out.println("Responsabilidad "+i+": "+responsabilidad);
                
                String colaborador = tablaCRC_colaboradores[i];
                System.out.println("Colaborador "+i+": "+colaborador);
                
                TablaTCRC rc = new TablaTCRC(responsabilidad, colaborador);
                tabla.add(rc);
                
            }
            TarjetaCRC tarjeta = new TarjetaCRC(TarjetaCRC.idTarjetaActual, clase, superClasses, subClasses, tabla);
            System.out.println("Se editó la tarjeta y vamos a guardarla");
            
            ActualizarTarjetaCRC actualizarTarjeta = new ActualizarTarjetaCRC(tarjeta);
            
            response.sendRedirect("MenuTarjetasCRC.jsp");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
