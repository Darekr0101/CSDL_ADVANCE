package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Orders;

public interface OrderService {
    void save(Orders orders);

    Orders getOrder(String orderId);

    Orders update(Orders orders);

    void delete(String orderId);
}
