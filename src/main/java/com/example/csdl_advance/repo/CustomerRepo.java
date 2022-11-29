package com.example.csdl_advance.repo;

import com.example.csdl_advance.collection.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends MongoRepository<Customer, String> {
    Customer findByCustomerName(String customerName);
}
