package com.example.csdl_advance.controller;

import com.example.csdl_advance.collection.Product;
import com.example.csdl_advance.repo.ProductRepo;
import com.example.csdl_advance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> saveProduct (@RequestBody Product product){
             productService.save(product);
             return ResponseEntity.ok(product);
    }

    @GetMapping
    public Product getProduct(@RequestParam String productId){
        return productService.getProduct(productId);
    }

    @DeleteMapping
    public String deleteProduct(@RequestParam String productId){
        productService.deleteProduct(productId);
        return "Xoa thanh cong";
    }

}
