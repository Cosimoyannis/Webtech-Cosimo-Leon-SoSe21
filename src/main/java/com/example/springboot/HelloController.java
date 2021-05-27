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

    @GetMapping(path = "/dbtest")
    public String dbtest() {
        return "dbtest";
    }

    @GetMapping(path = "/app")
    public String app() {
        return "app";
    }
}