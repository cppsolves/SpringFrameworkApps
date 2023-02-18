package com.example.UserManagementSystemRestUT.controller;

import com.example.UserManagementSystemRestUT.entityutil.Message;
import com.example.UserManagementSystemRestUT.jsonformatter.JsonToObject;
import com.example.UserManagementSystemRestUT.model.User;
import com.example.UserManagementSystemRestUT.service.UserService;
import com.example.UserManagementSystemRestUT.validationutil.DateOfBirth;
import com.example.UserManagementSystemRestUT.validationutil.EmailValidation;
import com.example.UserManagementSystemRestUT.validationutil.MandatoryParamsCheck;
import com.example.UserManagementSystemRestUT.validationutil.PhoneNumberValidation;
import jakarta.annotation.Nullable;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("master")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("adduser")
    public ResponseEntity<Message> ADDUSER(@RequestBody String json){
        User user;
        JSONObject jsonObject = new JSONObject(json);
        if(!MandatoryParamsCheck.paramsCheck(jsonObject)){
            return new ResponseEntity<>(new Message("Mandatory JSON Keys/parameters missing"), HttpStatus.BAD_REQUEST);
        }
        if(!EmailValidation.isValid(jsonObject.getString("email"))){
            return new ResponseEntity<>(new Message("Invalid email address"), HttpStatus.BAD_REQUEST);
        }
        if(!PhoneNumberValidation.isValid(jsonObject.getString("phoneNumber"))){
            return new ResponseEntity<>(new Message("Invalid phone number"), HttpStatus.BAD_REQUEST);
        }
        if(!DateOfBirth.isValidDate(jsonObject.getString("dateOfBirth"))){
            return new ResponseEntity<>(new Message("Invalid date of birth"), HttpStatus.BAD_REQUEST);
        }
        try{
            user = JsonToObject.convert(jsonObject);
        }
        catch (RuntimeException e){
            return new ResponseEntity<>(new Message("Error occurred while parsing JSON"),HttpStatus.CONFLICT);
        }
        userService.addUser(user);
        return new ResponseEntity<>(new Message("User saved"),HttpStatus.CREATED);
    }
    @GetMapping("getuser")
    public ResponseEntity<User> GETUSER(@Nullable @RequestParam Integer id){
        User user;
        if(null == id){
            return new ResponseEntity<User>(new User(),HttpStatus.BAD_REQUEST);
        }
        try{
            user = userService.getUser(id);
        }
        catch(RuntimeException e){
            return new ResponseEntity<User>(new User(),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
    }
    @GetMapping("getall")
    public List<User> GETALL(){
        return userService.getAllUser();
    }
    @PutMapping("update")
    public ResponseEntity<Message> UPDATE(@Nullable @RequestParam Integer id,@Nullable @RequestParam String userName){
        if(null == id || null == userName){
            return new ResponseEntity<Message>(new Message("Please provide mandatory parameters"),HttpStatus.BAD_REQUEST);
        }
        try{
          userService.updateUserInfo(id,userName);
        }
        catch(RuntimeException e){
           return new ResponseEntity<Message>(new Message("Updation failed:Invalid user id"),HttpStatus.BAD_REQUEST);
        }
       return new ResponseEntity<Message>(new Message("userName successfully updated"),HttpStatus.CREATED);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Message> DELETE(@Nullable @RequestParam Integer id){
        if(null == id){
            return new ResponseEntity<Message>(new Message("Please provide mandatory parameters"),HttpStatus.BAD_REQUEST);
        }
        try {
            userService.deleteUser(id);
        }
        catch(RuntimeException e){
            return new ResponseEntity<Message>(new Message("Deletion failed "),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Message>(new Message("userName successfully removed"),HttpStatus.NO_CONTENT);
    }
}
