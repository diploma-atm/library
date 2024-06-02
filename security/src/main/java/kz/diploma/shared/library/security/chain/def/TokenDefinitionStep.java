package kz.diploma.shared.library.security.chain.def;

import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import kz.diploma.shared.library.security.chain.check.CheckTokenStep;
import org.springframework.stereotype.Component;

@Component
public class TokenDefinitionStep extends AuthBaseChainStep {
    private static final String AUTH_TOKEN_NAME = "Authorization";

    protected TokenDefinitionStep(CheckTokenStep next) {
        super(next);
    }

    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        inputAuthParams.setToken(inputAuthParams.getRequest().getHeader(AUTH_TOKEN_NAME));
        return super.execute(inputAuthParams);
    }
}
