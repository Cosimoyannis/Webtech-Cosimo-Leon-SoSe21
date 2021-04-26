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



}