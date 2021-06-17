
package com.example.springboot;

import org.hibernate.type.UUIDBinaryType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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


}

