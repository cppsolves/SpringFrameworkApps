package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> list_;
    public UserService(){
        list_ = new ArrayList<>();
    }

    public void adduser(User obj){
        list_.add(obj);
    }
    public User getuser(int id){
        int low=0,high=list_.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(list_.get(mid).getUserId() == id) return list_.get(mid);
            else if(list_.get(mid).getUserId()>id) high = mid-1;
            else low=mid+1;
        }
        return new User(0,"notfound","notfound","notfound","notfound");
    }
    public List<User> getalluser(){
        return list_;
    }
    public User update(int id,User obj){
        if(id > list_.size()-1) return null;
        list_.get(id).setName(obj.getName());
        list_.get(id).setUserName(obj.getUserName());
        list_.get(id).setAddress(obj.getAddress());
        list_.get(id).setNumber(obj.getNumber());
        return list_.get(id);
    }
    public void delete(int id){
        list_.remove(id);
    }


}
