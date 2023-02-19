package com.example.ECommerceDemo.service;

import com.example.ECommerceDemo.dao.ProductRepository;
import com.example.ECommerceDemo.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService{
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getProductCategory(String category){
        List<Product> productList = productRepository.findAll();
        List<Product> answerList = new ArrayList<>();
        for(Product product : productList){
            if(product.getCategory().equals(category)){
                answerList.add(product);
            }
        }
        return answerList;
    }
    public void deleteId(Integer id){
        productRepository.deleteById(id);
    }
}
