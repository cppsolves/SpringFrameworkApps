package com.example.demo.service;

import com.example.demo.model.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class URLservice {

    @Autowired
    private Map<String,Integer> map_;
    public URL getCount(String username) {
        map_.put(username,map_.getOrDefault(username,0)+1);
        return new URL(username,map_.get(username));
    }

}
