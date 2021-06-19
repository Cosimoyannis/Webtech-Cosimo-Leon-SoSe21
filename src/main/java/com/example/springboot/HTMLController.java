package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HTMLController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping(path = Endpoints.HOMEPAGE)
    public String homepage() {
        return "homepage";
    }

    @GetMapping(path = Endpoints.APP)
    public String app() {
        return "app";
    }

    /*

    @GetMapping(path = Endpoints.PRODUCTS)
    String products(Model model) {

        model.addAttribute("products", productRepository.findAll());

        return "products";
    }
    
     */


}