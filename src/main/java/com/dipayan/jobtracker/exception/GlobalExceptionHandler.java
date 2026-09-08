package com.dipayan.jobtracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.Map;

@RestControllerAdvice //This makes the class a global exception handler
public class GlobalExceptionHandler {

    //handles ApplicationNotFoundException thrown anyhwere in the application
    @ExceptionHandler(ApplicationNotFoundException.class)

    //Tells Spring to return HTTP 404 when this exception occurs
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleApplicationNotFound(
        ApplicationNotFoundException exception)
        {
            return Map.of("error",exception.getMessage());
        }
    
}
