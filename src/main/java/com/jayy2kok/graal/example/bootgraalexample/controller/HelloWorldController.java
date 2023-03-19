package com.jayy2kok.graal.example.bootgraalexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name) {
        return "Hello " + name + "! Greetings!";
    }
}
