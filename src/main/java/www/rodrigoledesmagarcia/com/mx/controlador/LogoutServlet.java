package www.rodrigoledesmagarcia.com.mx.controlador;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import www.rodrigoledesmagarcia.com.mx.servicios.LoginServeceImpl;
import www.rodrigoledesmagarcia.com.mx.servicios.LoginService;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServeceImpl();
        Optional<String> username = auth.getUsername(req);
        if (username.isPresent()) {
            Cookie usernamecookie = new Cookie("username", "");
            usernamecookie.setMaxAge(1);
            resp.addCookie(usernamecookie);
        }
        resp.sendRedirect(req.getContextPath()+ "/login");

    }
}
