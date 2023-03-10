package com.example.ECommerceDemo.service;

import com.example.ECommerceDemo.dao.UserRepository;
import com.example.ECommerceDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }

}
