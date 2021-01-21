package com.example.demo.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServices {
    @RequestMapping(path = "/")
    String hello(){
        return "Hello World!";
    }
}
