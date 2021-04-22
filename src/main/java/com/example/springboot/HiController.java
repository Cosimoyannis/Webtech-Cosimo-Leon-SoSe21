package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HiController {

    @RequestMapping
    public String index() {
        return "helloworld";
    }

}