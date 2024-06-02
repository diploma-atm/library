package kz.diploma.shared.library.security.service.impl;

import kz.diploma.auth.access.api.AuthControllerApiClient;
import kz.diploma.auth.access.model.CheckSessionRequest;
import kz.diploma.auth.access.model.UserInfoDTO;
import kz.diploma.library.shared.error_handling.exception.AuthException;
import kz.diploma.shared.library.security.model.Roles;
import kz.diploma.shared.library.security.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthServiceImpl implements AuthService {
    @Lazy
    @Autowired
    private AuthControllerApiClient authControllerApiClient;

    @Override
    public Roles checkSession(String token) {
        log.info("authClient:: checkSession");

        try {
            ResponseEntity<UserInfoDTO> response = authControllerApiClient.checkSession(new CheckSessionRequest().token(token));

            if(response.getStatusCode().equals(HttpStatus.NOT_FOUND) || response.getStatusCode().equals(HttpStatus.UNAUTHORIZED)){
                throw new AuthException("Session is expired for token: %s".formatted(token), 401);
            }
            log.info("response:: checkSession  {}", response.getBody());

            var body = response.getBody();
            if(body == null){
                throw new IllegalArgumentException();
            }
            String role = body.getRole().toString();

            return Roles.valueOf(role);
        } catch (Exception e){
            throw new AuthException("Session is expired for token: %s".formatted(token), 401);
        }
    }
}
