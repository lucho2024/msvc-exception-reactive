package com.sunset.rider.lab.exceptions.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;



public class HeaderExeption extends RuntimeException{

    Map<String,Object> headersRe;

    public HeaderExeption(Map<String, Object> headersRe) {

        this.headersRe = headersRe;
    }


    public Map<String, Object> getHeadersRe() {
        return headersRe;
    }

    public void setHeadersRe(Map<String, Object> headersRe) {
        this.headersRe = headersRe;
    }
}
