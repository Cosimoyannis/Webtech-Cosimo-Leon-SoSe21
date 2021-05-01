package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;


@RestController
public class HiController {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String index() {
        String testEnvValue = Optional.of(env.getProperty("TEST_VALUE")).orElse("Environment variable not found");
        return "Hey I know environment variable, " + testEnvValue;
    }

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productService.findAll();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable String id) {
        Long productId = Long.parseLong(id);
        productService.deleteById(productId);
    }

    @GetMapping("/products/count")
    public Long count() {
    return productService.count();
    }



}

