package com.example.csdl_advance.controller;

import com.example.csdl_advance.collection.Customer;
import com.example.csdl_advance.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<Customer> saveCustomer (@RequestBody Customer customer){
        customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public Customer getCustomer(@RequestParam String customerName){
        return customerService.getCustomer(customerName);
    }

    @PutMapping
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }
    @DeleteMapping
    public String deleteCustomer(String customerId){
        customerService.deleteCustomer(customerId);
        return "Xoa thanh cong";
    }
}
