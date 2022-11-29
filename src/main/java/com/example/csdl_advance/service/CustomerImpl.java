package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Customer;
import com.example.csdl_advance.repo.CustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public Customer getCustomer(String customerName) {
        return customerRepo.findByCustomerName(customerName);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepo.deleteById(customerId);
    }

    @Override
    public void update(Customer customer) {
        Customer a = new Customer();
        BeanUtils.copyProperties(a, customer);
        customerRepo.save(a);
    }
}
