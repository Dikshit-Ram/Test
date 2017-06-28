package io.egen.training.ExceptionHandling;

import org.springframework.http.HttpStatus;

/**
 * Created by diksh on 6/27/2017.
 */
public class ErrorResponse extends RuntimeException {
    HttpStatus errorCode;
    String message;

    public ErrorResponse(HttpStatus errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
