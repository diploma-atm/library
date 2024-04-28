package kz.diploma.library.shared.error_handling.models;

import lombok.Builder;

@Builder
public record ErrorResponse(String url, Integer statusCode, String message) {

    public ErrorResponse(Integer statusCode, String message) {
            this(null, statusCode, message);
        }

}
