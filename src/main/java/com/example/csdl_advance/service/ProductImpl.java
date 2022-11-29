package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Product;
import com.example.csdl_advance.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public Product getProduct(String productId) {
        return productRepo.findById(productId).get();
    }
}
