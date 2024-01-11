package com.sunset.rider.lab.exceptions.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class NotFoundException extends RuntimeException{


    private Map<String,String> error;


    public NotFoundException() {
        error= new HashMap<>();
        error.put("error"," base de datos esta vacia");
        error.put("timestamp", LocalDateTime.now().toString());
    }
    public NotFoundException(String id) {
        error= new HashMap<>();
        error.put("error","En nuestra base de datos no existe el id ".concat(id));
        error.put("timestamp", LocalDateTime.now().toString());

    }



}



