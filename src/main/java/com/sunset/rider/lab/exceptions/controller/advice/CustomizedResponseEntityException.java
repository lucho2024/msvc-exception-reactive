package com.sunset.rider.lab.exceptions.controller.advice;

import com.sunset.rider.lab.exceptions.exception.HeaderExeption;
import com.sunset.rider.lab.exceptions.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class CustomizedResponseEntityException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HeaderExeption.class)
    public final ResponseEntity<?> handlerHeaderException(HeaderExeption ex){

        return  new ResponseEntity<>(ex.getHeadersRe(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<?> handleNotFoundExeption(NotFoundException ex){
        return  new ResponseEntity<>(ex.getError(), HttpStatus.NOT_FOUND);
    }
}
