package com.example.controllers;

import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.GET;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class SomeController {
    Logger log = Logger.getLogger(String.valueOf(SomeController.class));
@ExceptionHandler(IndexOutOfBoundsException.class)
public ResponseEntity handleError(){
    log.log(Level.WARNING,"working");
    ResponseEntity rp = new ResponseEntity(HttpStatus.NOT_FOUND);
    return rp;
}

        @GetMapping(value = "/num")
    public Map something() {
        Map model = new HashMap<>();
        model.put("data", new Date().toString());
        return model;
        //  return "helllo world";
    }
    @GetMapping(value = "/auth/pass")
    public String some() {
//       throw new IndexOutOfBoundsException();
        return "helllo world";
    }
}
