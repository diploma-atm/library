package kz.diploma.shared.library.security.chain.auth.params;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutputAuthParams {
    private boolean authDecision;
    private String errorMessage;
    private Integer statusCode;
}
