package com.example.UserManagementSystemRestUT.service;

import com.example.UserManagementSystemRestUT.model.User;
import com.example.UserManagementSystemRestUT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements Iuserservice{
    @Autowired
    UserRepository userRepository;
    @Override
    public void addUser(User user) {
       userRepository.save(user);
    }
    @Override
    public User getUser(int userId) throws RuntimeException{
        return  userRepository.findById(userId).get();
    }
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    @Override
    public void updateUserInfo(int id,String userName) throws RuntimeException {
        User user = userRepository.findById(id).get();
        user.setUserName(userName);
        userRepository.save(user);
    }
    @Override
    public void deleteUser(int id) throws RuntimeException {
        User user1 = userRepository.findById(id).get();
        userRepository.delete(user1);
    }
}
