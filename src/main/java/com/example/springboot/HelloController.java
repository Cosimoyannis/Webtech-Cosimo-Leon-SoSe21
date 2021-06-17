package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {


    @GetMapping(path = "/")
    public String homepage() {
        return "homepage";
    }

    @GetMapping(path = "/signin")
    public String signin() { return "signin"; }

    @GetMapping(path = "/register")
    public String register() {
        return "register";
    }

    @GetMapping(path = "/app")
    public String app() {
        return "app";
    }

    @GetMapping(path = "/testo")
    public String testo() {
        return "testo";
    }
}