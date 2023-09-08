package www.rodrigoledesmagarcia.com.mx.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import www.rodrigoledesmagarcia.com.mx.modelos.Producto;
import www.rodrigoledesmagarcia.com.mx.servicios.LoginServeceImpl;
import www.rodrigoledesmagarcia.com.mx.servicios.LoginService;
import www.rodrigoledesmagarcia.com.mx.servicios.ProductoService;
import www.rodrigoledesmagarcia.com.mx.servicios.ProductoServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;


@WebServlet("/productos.html")
public class ProductoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService service = new ProductoServiceImpl();
        List<Producto> productos = service.listar();

        LoginService auth = new LoginServeceImpl();
        Optional<String> cookieOptional = auth.getUsername(req);

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>El listado de los productos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de productos</h1>");
            if (cookieOptional.isPresent()) {
                out.println("<div style='color: green;'> Hola "+cookieOptional.get()+" Bienvenido</div>");
            }
            out.println("<table>");
            out.println("<tr>");
            out.println("<th> ID  |</th>");
            out.println("<th> Nombre del producto  |</th>");
            out.println("<th> Tipo y/o Categoria  |</th>");
            if (cookieOptional.isPresent()) {
                out.println("<th> Precio unitario  |</th>");
            }
            out.println("</tr>");
            productos.forEach(p -> {

                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNombre() + "</td>");
                out.println("<td>" + p.getTipo() + "</td>");
                if (cookieOptional.isPresent()) {
                    out.println("<td> $ " + p.getPrecio() + "</td>");
                }
                out.println("</tr>");


            });
            out.println("<p><a href=\"" + req.getContextPath() + "" + "\">Volver al inicio</a></p<");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");


        }
    }
}
