package www.rodrigoledesmagarcia.com.mx.servicios;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public interface LoginService {
    Optional<String> getUsername(HttpServletRequest req);
}
