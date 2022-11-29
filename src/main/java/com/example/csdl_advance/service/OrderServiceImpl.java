package com.example.csdl_advance.service;

import com.example.csdl_advance.collection.Orders;
import com.example.csdl_advance.repo.OrderRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public void save(Orders orders) {
        orderRepo.save(orders);
    }

    @Override
    public Orders getOrder(String orderId) {
        return orderRepo.findById(orderId).get();
    }

    @Override
    public Orders update(Orders orders) {
        Orders orders1 = new Orders();
        BeanUtils.copyProperties(orders1, orders);
        return orderRepo.save(orders1);
    }

    @Override
    public void delete(String orderId) {
        orderRepo.deleteById(orderId);
    }
}
