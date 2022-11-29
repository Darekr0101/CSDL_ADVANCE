package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {
    public void save(Product product);

    void deleteProduct(String productId);

    Product getProduct(String productId);
}
