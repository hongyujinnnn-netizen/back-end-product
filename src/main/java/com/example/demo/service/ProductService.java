package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findByDeletedFalse();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product newProduct) {
        Product product = productRepository.findById(String.valueOf(id))
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(newProduct.getName());
        product.setCode(newProduct.getCode());
        product.setPrice(newProduct.getPrice());
        product.setQty(newProduct.getQty());

        return productRepository.save(product);
    }
}
