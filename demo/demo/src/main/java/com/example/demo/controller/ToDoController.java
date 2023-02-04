package com.example.demo.controller;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo-app")
public class ToDoController
{
    private ToDoservice todoservice;
    public ToDoController(ToDoservice todoservice)
    {
        this.todoservice = todoservice;
    }
    @GetMapping("find-all")
    public List<ToDo> getallToDo()
    {
        return todoservice.findAll();
    }
}
