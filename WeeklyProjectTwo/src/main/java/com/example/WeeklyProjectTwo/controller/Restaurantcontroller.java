package com.example.WeeklyProjectTwo.controller;

import com.example.WeeklyProjectTwo.model.Acknowledge;
import com.example.WeeklyProjectTwo.model.Restaurant;
import com.example.WeeklyProjectTwo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class Restaurantcontroller {
    @Autowired
    private RestaurantService restservice;
    @PostMapping("/add")
    public void Add(@RequestBody Restaurant obj) {
        restservice.addRest(obj);
    }
    @GetMapping("/getAll")
    public List<Restaurant> GETALL() {
        return restservice.GETALL();
    }
    @GetMapping("find/{name}")
    public Restaurant FIND(@PathVariable String name) {
        return restservice.FIND(name);
    }
    @PutMapping("update/{name}/{newname}")
    public void UPDATE(@PathVariable  String name,@PathVariable String newname){
        restservice.UPDATE(name,newname);
    }
    @DeleteMapping("delete/{name}")
    public void DEL(@PathVariable  String name){
        restservice.DELETE(name);
    }
}
