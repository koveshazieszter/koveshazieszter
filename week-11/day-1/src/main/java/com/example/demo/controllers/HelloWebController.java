package com.example.demo.controllers;

//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWebController {
    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name" , name);
        model.addAttribute("count",new AutomaticLong().getGreetCount());
        return "greetin";
    }

}

