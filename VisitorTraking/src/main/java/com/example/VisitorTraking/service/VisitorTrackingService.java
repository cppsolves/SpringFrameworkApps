package com.example.VisitorTraking.service;

import com.example.VisitorTraking.model.VisitorTracking;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VisitorTrackingService {
    private Map<String,Integer> map_;
    public VisitorTrackingService(){
        map_ = new HashMap<>();
    }
    public VisitorTracking getdata(String name){
        map_.put(name,map_.getOrDefault(name,0)+1);
        return new VisitorTracking(name,map_.get(name));
    }

}
