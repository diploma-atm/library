package kz.diploma.library.shared.error_handling.controller.advice;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import kz.diploma.library.shared.error_handling.exception.IncorrectPinException;
import kz.diploma.library.shared.error_handling.exception.NegativeBalanceException;
import kz.diploma.library.shared.error_handling.models.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class BasicControllerAdvice {
    @ExceptionHandler({EntityNotFoundException.class})
    protected ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException e) {
        log.warn("Exception: {}", e.getMessage());

        ErrorResponse response = new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return new ResponseEntity<>(response, new HttpHeaders(), response.statusCode());
    }

    @ExceptionHandler({IncorrectPinException.class})
    protected ResponseEntity<Object> handleIncorrectPin(IncorrectPinException e) {
        log.warn("Exception: {}", e.getMessage());

        ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return new ResponseEntity<>(response, new HttpHeaders(), response.statusCode());
    }

    @ExceptionHandler({NegativeBalanceException.class})
    protected ResponseEntity<Object> handleNegativeBalance(NegativeBalanceException e) {
        log.warn("Exception: {}", e.getMessage());

        ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return new ResponseEntity<>(response, new HttpHeaders(), response.statusCode());
    }

    @ExceptionHandler({EntityExistsException.class})
    protected ResponseEntity<Object> handleEntityExists(EntityExistsException e) {
        log.warn("Exception: {}", e.getMessage());

        ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return new ResponseEntity<>(response, new HttpHeaders(), response.statusCode());
    }
}
