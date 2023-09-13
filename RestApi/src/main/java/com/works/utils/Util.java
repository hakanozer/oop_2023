package com.works.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class Util {

    public static ResponseEntity success( Object object ) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("result", object);
        return new ResponseEntity(hm, HttpStatus.OK);
    }

    public static ResponseEntity fail( Object object, HttpStatus httpStatus ) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", false);
        hm.put("error", object);
        return new ResponseEntity(hm, httpStatus);
    }


}
