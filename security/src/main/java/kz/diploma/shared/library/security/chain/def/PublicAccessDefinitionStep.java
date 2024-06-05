package kz.diploma.shared.library.security.chain.def;

import kz.diploma.shared.library.security.annotation.PublicAccess;
import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import org.springframework.stereotype.Component;

@Component
public class PublicAccessDefinitionStep extends AuthBaseChainStep {

    protected PublicAccessDefinitionStep(TokenDefinitionStep next) {
        super(next);
    }

    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        final PublicAccess publicAccess = inputAuthParams.getMethod().getMethodAnnotation(PublicAccess.class);
        inputAuthParams.setPublicAccess(publicAccess != null);
        return super.execute(inputAuthParams);
    }
}
