package com.example.URLHITCounter.service;

import com.example.URLHITCounter.model.Visitor;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
    private int count;
    public VisitorService(){
        count = 1;
    }
    public Visitor getCount(){
        return new Visitor(count++);
    }
}
