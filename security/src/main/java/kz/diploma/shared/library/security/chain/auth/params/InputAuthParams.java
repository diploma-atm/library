package kz.diploma.shared.library.security.chain.auth.params;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.diploma.shared.library.security.model.Roles;
import lombok.Data;
import org.springframework.web.method.HandlerMethod;

@Data
public class InputAuthParams {
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final HandlerMethod method;

    private String token;
    private boolean isValid;
    private boolean hasAccess;
    private Roles role;
}
