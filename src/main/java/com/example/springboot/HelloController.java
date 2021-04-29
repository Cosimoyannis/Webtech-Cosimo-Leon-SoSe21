package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {

    @GetMapping(path = "/home")
    public String home() {
        return "home";
    }

    @GetMapping(path = "/landingpage")
    public String landing() {
        return "landingpage";
    }

    @GetMapping(path = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/homepage")
    public String homepage() {
        return "homepage";
    }

    @GetMapping(path = "/signin")
    public String signin() {
        return "signin";
    }

    @GetMapping(path = "/register")
    public String register() {
        return "register";
    }
}