package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    @ResponseBody
    public Greeting greeting(){
        return new Greeting(1,"Hello Világ");
    }
}
