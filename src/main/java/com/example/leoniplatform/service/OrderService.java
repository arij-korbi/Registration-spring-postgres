package com.example.leoniplatform.service;

import com.example.leoniplatform.model.Order;
import com.example.leoniplatform.model.File;
import com.example.leoniplatform.model.User;
import com.example.leoniplatform.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repo;
    public Order saveOrder(Order order)
    {        return repo.save(order);
    }
    public List<Order> findAllOrders(){
        return repo.findAll();
    }
}
