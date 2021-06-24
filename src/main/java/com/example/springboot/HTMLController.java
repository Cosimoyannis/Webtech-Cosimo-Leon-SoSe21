package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HTMLController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductServiceImpl productServiceImpl;


    @GetMapping(path = Endpoints.HOMEPAGE)
    public String homepage() {
        return "homepage";
    }

    @GetMapping(path = Endpoints.BUTTON)
    public String button() {
        return "button";
    }

    @GetMapping(path = Endpoints.PRODUCTS)
    String products(Model model) {

        model.addAttribute("products", productRepository.findAll());

        return "products";
    }



/*
    @GetMapping(path = Endpoints.CREATEPRODUCT)
    String createproduct(Model model) {

        model.addAttribute("products", productRepository.findAll());

        return "products";
    }


    @GetMapping(path = Endpoints.LISTPRODUCTS)
    String listprodcuts(Model model) {

        model.addAttribute("listproducts", productRepository.findAll());

        return "listproducts";
    }*/






}