package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Categories;

public interface CategoryService {
    void save(Categories categories);

    Categories findByCategoryName(String categoryName);

    Categories update(Categories categories);

    void delete(String catgoryId);
}
