package kz.diploma.shared.library.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.diploma.library.shared.error_handling.models.ErrorResponse;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.main.AuthStateChain;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Slf4j
@RequiredArgsConstructor
public class RequestInterceptor implements HandlerInterceptor {
    private final AuthStateChain chain;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        if(request.getDispatcherType() != DispatcherType.ERROR && handler instanceof HandlerMethod method) {
            var state = new InputAuthParams(request, response, method);
            var params = chain.execute(state);
            if(params.isAuthDecision()) {
                return true;
            } else{
                renderError(request, response, params.getErrorMessage(), params.getStatusCode());
                return false;
            }
        }

        return true;
    }

    private void renderError(HttpServletRequest httpRequest, HttpServletResponse httpResponse, String message, Integer statusCode) throws IOException {
        httpResponse.setStatus(401);
        httpResponse.setContentType("application/json");
        httpResponse.setCharacterEncoding(StandardCharsets.UTF_8.name());

        ErrorResponse error = ErrorResponse.builder()
                .url(httpRequest.getRequestURL().toString())
                .message(message)
                .statusCode(statusCode)
                .build();

        httpResponse.getWriter().print(new ObjectMapper().writeValueAsString(error));
        httpResponse.getWriter().flush();
    }
}
