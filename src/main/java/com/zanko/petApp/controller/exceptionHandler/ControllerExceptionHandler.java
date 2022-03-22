package com.zanko.petApp.controller.exceptionHandler;

import com.zanko.petApp.exception.AppException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<AppException> handleInvalidFormatException(Exception e) {
        return getResponseEntity("Invalid Format", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<AppException> handleEntityNotFoundException(EntityNotFoundException e) {
        return getResponseEntity(e.getClass().getName(), e.getMessage(), HttpStatus.BAD_REQUEST);
    }


    private ResponseEntity<AppException> getResponseEntity(String error, String message, HttpStatus status) {
        return new ResponseEntity<>(new AppException(status.value(), error, message), status);
    }
}
