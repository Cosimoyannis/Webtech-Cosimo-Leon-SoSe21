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
public class MAINController {


    @Autowired
    private ProductRepository productRepository;


    @RequestMapping (
            method = RequestMethod.GET,
            path = "/products",
            produces = MediaType.APPLICATION_JSON_VALUE
    )




    @GetMapping("/products")
    public List<Product> allProducts() {
        List<Product> myList = new ArrayList<>();
        productRepository.findAll().forEach(myList::add);
        return myList;

    }


    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }



    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable int id) {

        productRepository.deleteById(id);
    }


    @GetMapping("/products/count")
    public Long count() {
    return productRepository.count();
    }




}

