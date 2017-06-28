package io.egen.training.controller;

import io.egen.training.ExceptionHandling.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
   // @ExceptionHandler(ErrorResponse.class)
   /* public ResponseEntity<ErrorResponse> exceptionHandler(ErrorResponse er) {
        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage("Please contact your administrator");
        return new ResponseEntity<>(error, HttpStatus.OK);
    }*/
}
