package com.example.URLHITCounter.controller;

import com.example.URLHITCounter.model.Visitor;
import com.example.URLHITCounter.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class VisitController {

    @Autowired
    VisitorService visitorService;
    @GetMapping("count")
    public Visitor getCount(){
        return visitorService.getCount();
    }
}
