package kz.diploma.shared.library.security.chain.check;

import kz.diploma.shared.library.security.chain.auth.impl.AuthConditionalChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.error.UnauthorizedAccessStep;
import kz.diploma.shared.library.security.chain.main.AuthSuccessStep;
import org.springframework.stereotype.Component;

@Component
public class CheckPublicAccessStep extends AuthConditionalChainStep {
    protected CheckPublicAccessStep(AuthSuccessStep ifTrue, UnauthorizedAccessStep ifFalse) {
        super(ifTrue, ifFalse);
    }

    @Override
    protected boolean branch(InputAuthParams inputAuthParams) {
        return inputAuthParams.isPublicAccess();
    }
}
