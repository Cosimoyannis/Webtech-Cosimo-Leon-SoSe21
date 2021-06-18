package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.security.core.parameters.P;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.print.attribute.standard.JobKOctets;
import java.awt.*;
import java.util.*;
import java.util.List;


@Controller
public class PRODUCTController {


/*
    @Autowired
    private ProductRepository productRepository;


    private final ProductServiceImpl productServiceImpl;

    public PRODUCTController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }



    @GetMapping("/Endpoints.das")
    public ModelAndView showProductList() {
        List<Product> products = productServiceImpl.findAll();
        Map<String, Object> viewModel = new HashMap<>();
        viewModel.put("products", products);
        return new ModelAndView(ViewNames.DAS, viewModel);
    }*/



   /* @GetMapping(Endpoints.DAS)
    public ModelAndView showForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return new ModelAndView(ViewNames.DAS);
    }*/


    /*@RequestMapping(value = "/products")
            public String getAllProducts(Model model)
    {
        List<Product> products = productRepository.findAll();

        model.addAttribute("products", products);

        return "products";

    }*/





}

