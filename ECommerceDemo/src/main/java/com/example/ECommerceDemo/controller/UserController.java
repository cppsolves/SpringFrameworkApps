package com.example.ECommerceDemo.controller;

import com.example.ECommerceDemo.model.User;
import com.example.ECommerceDemo.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("master")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("getuserId")
    public User getUser(@Nullable @RequestParam Integer id){
        return userService.getUserById(id);
    }
}
