package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("masterUser")
public class UserController {

    private UserService userservice;
    @Autowired
    public void setter(UserService obj) {
        this.userservice =  obj;
    }
    @PostMapping ("adduser")
    public ResponseEntity<User> add(@RequestBody User obj){
        userservice.adduser(obj);
        return new ResponseEntity<User>(HttpStatus.OK);
    }
    @GetMapping("getUser/{id}")
    public User addid(@PathVariable int id){
        return userservice.getuser(id);
    }
    @GetMapping("getAllUser")
    public List<User> getall(){
        return userservice.getalluser();
    }
    @PutMapping("updateUserInfo/{id}")
    public ResponseEntity<User> update(@PathVariable int id,@RequestBody User obj){
        User Obj = userservice.update(id,obj);
        if(null!=Obj){
            return new ResponseEntity<User>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("deleteUser/{id}")
    public void delete(@PathVariable int id){
        userservice.delete(id);
    }
}
