package com.example.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
