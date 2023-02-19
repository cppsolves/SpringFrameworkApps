package com.example.ECommerceDemo.dao;

import com.example.ECommerceDemo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
