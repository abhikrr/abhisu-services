package com.abhisu.abhisuservices.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> message(){
        System.out.println("Application running on Azure.");
        return new ResponseEntity<String>("Application running on Azure.", HttpStatus.OK);

    }
}
