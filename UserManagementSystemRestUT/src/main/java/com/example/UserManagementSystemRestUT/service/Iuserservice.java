package com.example.UserManagementSystemRestUT.service;

import com.example.UserManagementSystemRestUT.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface Iuserservice {
    void addUser(User user);
    User getUser(int userId);
    List<User> getAllUser();
    void updateUserInfo(int id,String userName);
    void deleteUser(int id);
}
