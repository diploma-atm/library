package kz.diploma.shared.library.security.chain.error;

import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import kz.diploma.shared.library.security.chain.base.AbstractChainStep;
import org.springframework.stereotype.Component;

@Component
public class UnauthorizedAccessStep implements AbstractChainStep<InputAuthParams, OutputAuthParams> {
    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        return OutputAuthParams.builder()
                .authDecision(false)
                .statusCode(401)
                .errorMessage("Unauthorized access")
                .build();
    }
}
