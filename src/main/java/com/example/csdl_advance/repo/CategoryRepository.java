package com.example.csdl_advance.repo;

import com.example.csdl_advance.collection.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Categories, String> {
    Categories findByCategoryName(String categoryName);
}
