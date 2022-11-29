package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Customer;

public interface CustomerService {
    void save(Customer customer);

    Customer getCustomer(String customerName);

    void deleteCustomer(String customerId);

    void update(Customer customer);
}
