package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    @ResponseBody
    public Greeting optional(@RequestParam(required = false) String content) {
        return new Greeting(new  AutomaticLong().getGreetCount(),"Hello " +content+"!");
    }
}
