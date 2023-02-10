package com.example.erpapp.controller;

import com.example.erpapp.dto.StudentPercentageDTO;
import com.example.erpapp.model.Student;
import com.example.erpapp.service.ERPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("master")
public class ERPController {

    @Autowired
    private ERPService erpService;
    @PostMapping("/addlibrary")
    public void add(@RequestBody Student obj){
        erpService.add(obj);
    }
    @GetMapping("findall")
    public List<Student> getAll() {
        return erpService.list_;
    }
    @GetMapping("findbyId/{id}")
    public Student findid(@PathVariable int id){
       return erpService.getstudent(id);
    }
    @GetMapping("getperc")
    public List<StudentPercentageDTO> getperc(){
        return erpService.getperc();
    }
    @GetMapping("gettopper")
    public StudentPercentageDTO gettopper() {
          return erpService.getTopper();
    }
}
