package com.example.WeeklyProjectTwo.service;

import com.example.WeeklyProjectTwo.model.Acknowledge;
import com.example.WeeklyProjectTwo.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private List<Restaurant> list_;
    public RestaurantService(){
        list_ = new ArrayList<>();
    }
    public void addRest(Restaurant obj) {
        list_.add(obj);
    }
    public List<Restaurant> GETALL() {
        return this.list_;
    }
    public Restaurant FIND(String name){
        for(Restaurant obj : list_){
            if(obj.getName().equals(name)) return obj;
        }
        return new Restaurant("invalid request","invalid request","invalid request",0,0.0);
    }
    public void UPDATE(String name,String newname){
        for(Restaurant obj : list_){
            if(obj.getName().equals(name)){
                obj.setName(newname);
            }
        }
    }
    public void DELETE(String name){
        for(int i=0;i<list_.size();i++){
            if(list_.get(i).getName().equals(name)){
                list_.remove(i);
                return;
            }
        }
    }
}
