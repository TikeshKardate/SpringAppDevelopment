package com.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAppController {

    //UC1.1 Method to print the Hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
