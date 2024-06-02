package kz.diploma.shared.library.security.chain.error;

import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import kz.diploma.shared.library.security.chain.base.AbstractChainStep;
import org.springframework.stereotype.Component;

@Component
public class AccessDeniedStep implements AbstractChainStep<InputAuthParams, OutputAuthParams> {
    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        return OutputAuthParams.builder()
                .authDecision(false)
                .errorMessage("Access denied")
                .statusCode(403)
                .build();
    }
}
