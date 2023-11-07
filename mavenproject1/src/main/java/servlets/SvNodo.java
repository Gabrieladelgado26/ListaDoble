package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import umariana.com.ListaDoble;

@WebServlet(name = "SvNodo", urlPatterns = {"/SvNodo"})
public class SvNodo extends HttpServlet {
    
    private final ListaDoble listaDoble;
    
    // Constructor para instanciar la lista doble
    public SvNodo()
    {
        listaDoble = new ListaDoble();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String opcion = request.getParameter("opcion");
        String dato = request.getParameter("dato");
        
        String message = "";
        int pDato;
        
        // Manejo de opciones de menú
        switch (opcion)
        {
            case "opcion1":
                pDato = Integer.parseInt(dato);
                listaDoble.agregarNodoInicio(pDato);
                listaDoble.mostrarListaIF();
                request.setAttribute("datosLista", listaDoble.mostrarListaIF());
                message = "Nodo insertado al inicio con exito :)";
                request.setAttribute("message", message);
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
                
            case "opcion2":
                pDato = Integer.parseInt(dato);
                listaDoble.agregarNodoFinal(pDato);
                listaDoble.mostrarListaIF();
                request.setAttribute("datosLista", listaDoble.mostrarListaIF());
                message = "Nodo insertado al inicio con exito :)";
                request.setAttribute("message", message);
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
                
            case "opcion3":
                listaDoble.mostrarListaIF();
                request.setAttribute("datosLista", listaDoble.mostrarListaIF());
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
                
            case "opcion4":
                listaDoble.mostrarListaFI();
                request.setAttribute("datosLista", listaDoble.mostrarListaFI());
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
                
            case "opcion5":
                listaDoble.eliminarNodoInicio();
                listaDoble.mostrarListaIF();
                request.setAttribute("datosLista", listaDoble.mostrarListaIF());
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
                
            case "opcion6":
                listaDoble.eliminarNodoFinal();
                listaDoble.mostrarListaIF();
                request.setAttribute("datosLista", listaDoble.mostrarListaIF());
                request.getRequestDispatcher("lista.jsp").forward(request, response);
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
