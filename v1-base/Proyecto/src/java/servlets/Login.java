package servlets;

import MetodosBD.ObtenerUsuario;
import Pojos.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    public Usuario usuarioSesion;
    PrintWriter out;
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
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        out = response.getWriter();
  
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Login</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");

        String emailForm = request.getParameter("email");
        String passwordForm = request.getParameter("pass");

        if (verificarDatos(emailForm, passwordForm, response)) {
            request.getSession().setAttribute("email", ObtenerUsuario.usuarioLogeado.getEmail());
            response.sendRedirect("Home.jsp");
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

    
    public boolean verificarDatos(String emailForm, String passwordForm, HttpServletResponse response) {
        System.out.println("Entró a comprar");
        ObtenerUsuario verificacionUsuario = new ObtenerUsuario(emailForm, passwordForm);
        usuarioSesion = verificacionUsuario.obtenerUsuarioSesion();
        if(usuarioSesion.getEmail().equals(emailForm)
                && usuarioSesion.getPassword().equals(passwordForm)){
            return true;
            
        }
        else
            return false;
    }
}
