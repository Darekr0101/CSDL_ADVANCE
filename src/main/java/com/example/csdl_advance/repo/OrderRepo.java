package com.example.csdl_advance.repo;

import com.example.csdl_advance.collection.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Orders, String> {
}
