package com.example.csdl_advance.controller;

import com.example.csdl_advance.collection.Orders;
import com.example.csdl_advance.service.CustomerService;
import com.example.csdl_advance.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController("order")
@RequestMapping

public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Orders> saveCustomer(@RequestBody Orders orders) {
        orderService.save(orders);
        return ResponseEntity.ok(orders);
    }
    @GetMapping
    public Orders getOrder(@RequestParam String orderId){
         return orderService.getOrder(orderId);
    }

    @PutMapping
    public Orders updateOrder(@RequestBody Orders orders){
        return orderService.update(orders);
    }
    @DeleteMapping
    public String deleteOrder(@RequestParam String orderId){
        orderService.delete(orderId);
        return "Xoa thanh cong";
    }

}
