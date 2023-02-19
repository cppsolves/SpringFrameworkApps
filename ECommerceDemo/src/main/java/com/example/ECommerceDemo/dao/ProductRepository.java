package com.example.ECommerceDemo.dao;

import com.example.ECommerceDemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
