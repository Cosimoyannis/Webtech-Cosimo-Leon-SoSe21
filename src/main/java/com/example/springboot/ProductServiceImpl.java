
package com.example.springboot;

import org.hibernate.type.UUIDBinaryType;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {


    private final RestTemplate restTemplate;
    private final ProductRepository productRepository;



    public ProductServiceImpl(RestTemplate restTemplate, ProductRepository productRepository) {
        this.restTemplate = restTemplate;
        this.productRepository = productRepository;
    }



    public List<Product> findAll(String userEmail) {

        var iterator = productRepository.findAll();

        var products = new ArrayList<Product>();
        for (Product p : iterator) {
            if (p.getOwner() != null && p.getOwner().equals(userEmail)) products.add(p);
        }

        return products;
    }


    public Long count() {

        return productRepository.count();
    }

    public void deleteById(int id) {

        productRepository.deleteById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void updateCount(int id, int count) {
        Product product = productRepository.getOne(id);
        product.setCount(count);
        productRepository.save(product);
    }


/*

    public List<Product> findAll() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }



    public List<Product> findAll2() {
        List<Product> myList = new ArrayList<>();
        productRepository.findAll().forEach(myList::add);
        return myList;
    }

     */






}

