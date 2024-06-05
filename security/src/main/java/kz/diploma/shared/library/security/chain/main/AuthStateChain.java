package kz.diploma.shared.library.security.chain.main;

import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.def.PublicAccessDefinitionStep;
import org.springframework.stereotype.Component;

@Component
public class AuthStateChain extends AuthBaseChainStep {
    protected AuthStateChain(PublicAccessDefinitionStep next) {
        super(next);
    }

}
