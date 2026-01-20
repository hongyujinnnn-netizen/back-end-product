package com.example.demo.dto;

public class ProductResponse {

    private Long id;
    private String code;
    private String name;
    private Double price;
    private Integer qty;

    public ProductResponse(Long id, String code, String name, Double price, Integer qty) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}

