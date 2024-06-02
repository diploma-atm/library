package kz.diploma.library.shared.error_handling.exception;

import kz.diploma.library.shared.error_handling.models.ErrorResponse;

public class AuthException extends RuntimeException {

    public final ErrorResponse errorResponse;

    public AuthException(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public AuthException(String message, int status) {
        this.errorResponse = new ErrorResponse(null, status, message);
    }

    public Integer getStatus() {
        return errorResponse.statusCode();
    }

}
