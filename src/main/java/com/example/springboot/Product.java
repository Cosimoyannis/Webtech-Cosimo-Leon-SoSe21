package com.example.springboot;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Table;
import javax.annotation.processing.Generated;
import javax.persistence.*;


@Entity
@Table (name = "product")
public class Product {

    @Nullable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private String name;

    @Nullable
    private int price;

    @Nullable
    private String owner;





    public Product(int id, String name, int price, String owner) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.owner = owner;
    }

    public Product() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



}
