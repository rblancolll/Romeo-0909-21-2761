import Clases.Alumno;
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


@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
    Alumno alumno;
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<link rel=stylesheet href=CSS/css.css media=all >");
            respuesta.println("<html>");
            alumno=new Alumno();    
            alumno.setCodigo(request.getParameter("codigo"));
            alumno.setNombre(request.getParameter("nombre"));
            alumno.setApellido(request.getParameter("apellido"));
            alumno.setDireccion(request.getParameter("direccion"));
            alumno.setCorreo(request.getParameter("correo"));
            alumno.setTelefono(request.getParameter("telefono"));
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Cliente</title>");            
            respuesta.println("</head>");
            respuesta.println("<body>");
            respuesta.println("<h1> Cliente " + request.getContextPath() + "</h1>");
            respuesta.println("<h1>Datos del cliente registrado, gracias por registrarse </h1><br>");         
            respuesta.println("<h2>" + "Código: "+ alumno.getCodigo() + "</h2>");
            respuesta.println("<h2>" + "Nombre: "+ alumno.getNombre() + "</h2>");
            respuesta.println("<h2>" + "Apellido: "+ alumno.getApellido() + "</h2>");
            respuesta.println("<h2>" + "Dirección: "+alumno.getDireccion() + "</h2>");
            respuesta.println("<h2>" + "Correo: "+ alumno.getCorreo() + "</h2>");
            respuesta.println("<h2>" + "Teléfono: "+ alumno.getTelefono() + "</h2><br>");
            respuesta.println("<center>CLIENTE1 </center><br>");  
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<a href= 'index2.html'> Registrar nuevo cliente </a><br>"); 
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<a href= 'index.html'> Volver a la Página Principal del formulario </a>");
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
