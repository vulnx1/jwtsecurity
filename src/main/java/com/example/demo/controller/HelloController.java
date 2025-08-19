package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, open to everyone!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello USER!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello ADMIN!";
    }
}

