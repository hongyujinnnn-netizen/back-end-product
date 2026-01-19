package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "products")
public class Product {

    @jakarta.persistence.Id
    private Long id;
    @Id
    private String code;

    private String name;
    private double price;
    private int qty;

    @Column(name = "is_deleted")
    private boolean deleted;
}

