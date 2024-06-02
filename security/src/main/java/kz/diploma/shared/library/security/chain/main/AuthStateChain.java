package kz.diploma.shared.library.security.chain.main;

import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.def.TokenDefinitionStep;
import org.springframework.stereotype.Component;

@Component
public class AuthStateChain extends AuthBaseChainStep {
    protected AuthStateChain(TokenDefinitionStep next) {
        super(next);
    }

}
