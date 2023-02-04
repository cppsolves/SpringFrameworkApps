package com.example.demo.service;

import com.example.demo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoservice {
    private static final List<ToDo> list_ = new ArrayList<>();
    private static int count = 0;
    static{
        list_.add(new ToDo(++count,"C++",23,"Bajarne stroustrup"));
        list_.add(new ToDo(++count,"Java",45,"Colt steel"));
        list_.add(new ToDo(++count,"php",67,"Mike barnes"));
        list_.add(new ToDo(++count,"Rust",34,"Jim taylor"));
        list_.add(new ToDo(++count,"Go",20,"Jumpa Lahiri"));
    }
    public List<ToDo> findAll(){  //returns the entire data set
        return list_;
    }

}
