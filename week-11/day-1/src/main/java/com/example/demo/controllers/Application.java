package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Application {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello()
    {
        return "Hello Világ!";
    }

}
