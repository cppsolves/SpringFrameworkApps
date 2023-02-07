package com.example.VisitorTraking.controller;

import com.example.VisitorTraking.model.VisitorTracking;
import com.example.VisitorTraking.service.VisitorTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("master")
public class VisitorTrackingController {
    @Autowired
    private VisitorTrackingService visitorTrackingService;
    @GetMapping("/visitCount/{name}")
    public VisitorTracking get(@PathVariable String name){
        return visitorTrackingService.getdata(name);
    }
}
