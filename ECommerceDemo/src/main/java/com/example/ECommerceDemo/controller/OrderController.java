package com.example.ECommerceDemo.controller;

import com.example.ECommerceDemo.model.Order;
import com.example.ECommerceDemo.service.OrderService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("orderbyId")
    public Order GetOrderById(@Nullable @RequestParam Integer id){
        return orderService.getorderById(id);
    }
}
