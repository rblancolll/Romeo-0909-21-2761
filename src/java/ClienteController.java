import Clases.ClienteModell;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.apache.coyote.http11.Constants.a;

/**
 *
 * @author Fernanda Cordón
 */


@WebServlet(urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {
   private static final long serialVersionUID = 1L;
    ClienteModell cliente;
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<link rel=stylesheet href=CSS/css.css media=all >");
            respuesta.println("<html>");
            cliente =new ClienteModell();    
            cliente.setCodigo2(request.getParameter("codigo2"));
            cliente.setNombre2(request.getParameter("nombre2"));
            cliente.setApellido2(request.getParameter("apellido2"));
            cliente.setDireccion2(request.getParameter("direccion2"));
            cliente.setCorreo2(request.getParameter("correo2"));
            cliente.setTelefono2(request.getParameter("telefono2"));
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Cliente</title>");            
            respuesta.println("</head>");
            respuesta.println("<body>");
            respuesta.println("<h1>Cliente " + request.getContextPath() + "</h1>");
            respuesta.println("<h1>Datos del cliente registrado, gracias por registrarse </h1><br>");         
            respuesta.println("<h2>" + "Código:"+ cliente.getCodigo2() + "</h2>");
            respuesta.println("<h2>" + "Nombre:"+ cliente.getNombre2() + "</h2>");
            respuesta.println("<h2>" + "Apellido:"+ cliente.getApellido2() + "</h2>");
            respuesta.println("<h2>" + "Dirección:"+ cliente.getDireccion2() + "</h2>");
            respuesta.println("<h2>" + "Correo:"+ cliente.getCorreo2() + "</h2>");
            respuesta.println("<h2>" + "Teléfono:"+ cliente.getTelefono2() + "</h2><br>");
            respuesta.println("<center>CLIENTE2 </center><br>");  
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<br>");
            respuesta.println("<a href= 'index2.html'> Volver a la Página Principal del formulario </a>");
            respuesta.println("<html>");
            respuesta.println("</body>");
            respuesta.println("</html>");
            
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

