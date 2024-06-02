package kz.diploma.shared.library.security.chain.check;

import kz.diploma.shared.library.security.chain.auth.impl.AuthConditionalChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.def.SessionDefinitionStep;
import kz.diploma.shared.library.security.chain.error.UnauthorizedAccessStep;
import org.springframework.stereotype.Component;

@Component
public class CheckTokenStep extends AuthConditionalChainStep {
    protected CheckTokenStep(SessionDefinitionStep chainA, UnauthorizedAccessStep chainB) {
        super(chainA, chainB);
    }

    @Override
    protected boolean branch(InputAuthParams inputAuthParams) {
        return inputAuthParams.getToken() != null;
    }
}
