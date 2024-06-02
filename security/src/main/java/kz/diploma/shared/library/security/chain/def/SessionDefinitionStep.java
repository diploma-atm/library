package kz.diploma.shared.library.security.chain.def;

import kz.diploma.library.shared.error_handling.exception.AuthException;
import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import kz.diploma.shared.library.security.service.AuthService;
import org.springframework.stereotype.Component;

@Component
public class SessionDefinitionStep extends AuthBaseChainStep {
    private final AuthService authService;

    protected SessionDefinitionStep(RolesDefinitionStep next, AuthService authService) {
        super(next);
        this.authService = authService;
    }

    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        try {
            inputAuthParams.setRole(authService.checkSession(inputAuthParams.getToken()));
            inputAuthParams.setValid(authService.checkSession(inputAuthParams.getToken()) != null);
        } catch (AuthException e) {
            inputAuthParams.setValid(false);
        }

        return super.execute(inputAuthParams);
    }
}
