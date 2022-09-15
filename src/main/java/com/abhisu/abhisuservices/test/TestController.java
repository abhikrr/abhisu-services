package com.abhisu.abhisuservices.test;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/test")
    public String message(){
        System.out.println("Application running on Azure.");
        return "Application running on Azure.";
    }
}
