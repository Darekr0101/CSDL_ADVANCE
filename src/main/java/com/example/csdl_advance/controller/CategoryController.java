package com.example.csdl_advance.controller;

import com.example.csdl_advance.collection.Categories;
import com.example.csdl_advance.service.CategoryImpl;
import com.example.csdl_advance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Categories> savCategories(@RequestBody Categories categories) {
        categoryService.save(categories);
        return ResponseEntity.ok(categories);
    }

    @GetMapping()
    public Categories getCategory (@RequestParam("name") String categoryName){
            return categoryService.findByCategoryName(categoryName);
    }

    @PutMapping()
    public Categories UpdateCaterory(@RequestBody Categories categories){
        return categoryService.update(categories);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCategory(String categoryId){
           categoryService.delete(categoryId);
        return  new ResponseEntity<>("Xoá thành công", HttpStatus.OK);
    }


}
