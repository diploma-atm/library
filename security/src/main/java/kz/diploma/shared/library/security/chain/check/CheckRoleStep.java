package kz.diploma.shared.library.security.chain.check;

import kz.diploma.shared.library.security.chain.auth.impl.AuthConditionalChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.error.AccessDeniedStep;
import kz.diploma.shared.library.security.chain.main.AuthSuccessStep;
import org.springframework.stereotype.Component;

@Component
public class CheckRoleStep extends AuthConditionalChainStep {
    protected CheckRoleStep(AuthSuccessStep chainA, AccessDeniedStep chainB) {
        super(chainA, chainB);
    }

    @Override
    protected boolean branch(InputAuthParams inputAuthParams) {
        return inputAuthParams.isHasAccess();
    }
}
