package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Greeting {
    private long GreetCount;
    private String content;

    public Greeting(long greetCount, String content) {
        GreetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return GreetCount;
    }

    public String getContent() {
        return content;
    }
}

