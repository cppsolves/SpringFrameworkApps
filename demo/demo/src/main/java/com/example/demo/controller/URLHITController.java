package com.example.demo.controller;

import com.example.demo.model.URL;
import com.example.demo.service.URLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("master")
public class URLHITController
{
    @Autowired
    public URLservice urlservice;
    @GetMapping("/HitCount/{username}")
    public URL hitcount(@PathVariable  String username) {
        return urlservice.getCount(username);
    }

}
