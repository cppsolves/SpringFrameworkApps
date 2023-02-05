package com.example.demo.controller;
import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("master")
public class ToDoController {
    @Autowired
    private ToDoservice todoservice;
    @GetMapping("getAll")
    public List<ToDo> getAllToDo() {
        return todoservice.findAll();
    }
    @GetMapping("findbyId/{id}")
    public ToDo Find(@PathVariable int id) {
        return todoservice.findid(id);
    }
    @PostMapping("/update")
    public void Update(@RequestBody ToDo obj) {
        todoservice.Update(obj);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        todoservice.del(id);
    }
    @PutMapping("/updateSet/{id}")
    public void updateset(@PathVariable int id,@RequestBody ToDo obj) {
        todoservice.updateset(id,obj);
    }
}
