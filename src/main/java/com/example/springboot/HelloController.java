package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping(path = "/hello-world")
    public String index() {
        return "helloworld";
    }

}