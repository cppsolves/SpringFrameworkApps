package com.example.ECommerceDemo.service;

import com.example.ECommerceDemo.dao.OrderRepository;
import com.example.ECommerceDemo.model.Order;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;
    public Order getorderById(Integer id){
        Order order = orderRepository.findById(id).get();
        return order;
    }
}
