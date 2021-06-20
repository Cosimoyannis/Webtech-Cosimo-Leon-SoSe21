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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import javax.print.attribute.standard.JobKOctets;
import java.awt.*;
import java.util.*;
import java.util.List;


@Controller
public class MAINController {


    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductServiceImpl productServiceImpl;



    @RequestMapping (
            method = RequestMethod.GET,
            path = "/products",
            produces = MediaType.APPLICATION_JSON_VALUE
    )



/*
    @GetMapping("/products")
    public List<Product> allProducts() {
        List<Product> myList = new ArrayList<>();
        productRepository.findAll().forEach(myList::add);
        return myList;

    }

 */



    @GetMapping("/products")
    public List<Product> allProducts() {
        return productRepository.findAll();
    }


    @GetMapping("/listproducts")
    public String productsTable(@AuthenticationPrincipal OidcUser user, Model model) {
        List<Product> products = productServiceImpl.findAll(user.getEmail());
        model.addAttribute("products", products);
        return "productstable";
    }

    @GetMapping("/createproduct")
    public String productForm(Model model) {
        model.addAttribute("product", new Product());
        return "productcreation";
    }

    @GetMapping("/products/count")
    public Long count() {
        return productRepository.count();
    }







    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productServiceImpl.save(product);
    }


    @PostMapping("/createproduct")
    public String productSubmit(@AuthenticationPrincipal OidcUser user, @ModelAttribute Product product, Model model) {
        product.setOwner(user.getEmail());
        productServiceImpl.save(product);
        model.addAttribute("product", product);
        return "productresult";
    }








    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable int id) {

        productServiceImpl.deleteById(id);
    }







}

