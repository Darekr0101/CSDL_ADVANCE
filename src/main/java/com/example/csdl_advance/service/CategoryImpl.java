package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Categories;
import com.example.csdl_advance.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryImpl implements  CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void save(Categories categories) {
        categoryRepository.save(categories);
    }

    @Override
    public Categories findByCategoryName(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }

    @Override
    public Categories update(Categories categories) {
        Categories categories1 = new Categories();
        categories1.setCategoryName(categories.getCategoryName());
        categories1.setDescription(categories.getDescription());
        categories1.setId(categories.getId());
        return categoryRepository.save(categories1);
    }

    @Override
    public void delete(String categoryId) {
        categoryRepository.deleteById(categoryId);
    }

}
