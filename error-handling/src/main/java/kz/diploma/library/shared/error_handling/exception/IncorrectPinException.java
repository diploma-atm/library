package kz.diploma.library.shared.error_handling.exception;

public class IncorrectPinException extends RuntimeException {
    public IncorrectPinException(String message) {
        super(message);
    }
}
