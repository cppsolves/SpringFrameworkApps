package com.example.UniversityEventManagment.controller;

import com.example.UniversityEventManagment.model.Student;
import com.example.UniversityEventManagment.service.Istudentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Studentmaster")
public class StudentController {
    @Autowired
    Istudentservice istudentservice;
    @PostMapping("AddStudent")
    public void ADDSTUDENT(@RequestBody Student obj){
        istudentservice.addStudent(obj);
    }
    @PutMapping("UpdateStudent/{id}/{department}")
    public void UPDATESTUDENT(@PathVariable int id,@PathVariable String department){
        istudentservice.updateStudent(id,department);
    }
    @DeleteMapping("deletesStudent/{id}")
    public void DELETESTUDENT(@PathVariable int id){
        istudentservice.deleteStudent(id);
    }
    @GetMapping("findAll")
    public List<Student> FINDALL(){
        return istudentservice.getAllStudents();
    }
    @GetMapping("findById/{id}")
    public Student GETBYID(@PathVariable int id){
        return istudentservice.getStudentbyId(id);
    }
}
