package com.example.ECommerceDemo.controller;

import com.example.ECommerceDemo.model.Product;
import com.example.ECommerceDemo.service.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("getproductsAll")
    public List<Product> getallProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("Getbycategory")
    public List<Product> getBycategory(@Nullable @RequestParam String catgory){
        return productService.getProductCategory(catgory);
    }
    @DeleteMapping("deleteById")
    public ResponseEntity deleteById(@Nullable @RequestParam Integer id){
        if(null!=id){
            productService.deleteId(id);
            return new ResponseEntity<>("successfully deleted", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("Please provide valid Product Id",HttpStatus.BAD_REQUEST);
    }
}
