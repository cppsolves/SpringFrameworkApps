package com.example.SampleDatabasePractice.controller;

import com.example.SampleDatabasePractice.dto.Message;
import com.example.SampleDatabasePractice.dto.StudentAgeProjection;
import com.example.SampleDatabasePractice.dto.StudentAgeProjection;
import com.example.SampleDatabasePractice.model.Student;
import com.example.SampleDatabasePractice.service.StudentService;
import com.example.SampleDatabasePractice.utils.StringToStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("master")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("saveStudent")
    public ResponseEntity<Message> post(@RequestBody String student){
        Student student1 = StringToStudent.convert(student);
        studentService.saveStudent(student1);
        return new ResponseEntity<>(new Message("student saved"), HttpStatus.CREATED);
    }
    @GetMapping("getByFirstName")
    public Student getbyname(@RequestParam String name){
        return studentService.getByFirstName(name);
    }
    @GetMapping("getbyLastName")
    public Student getbyLastname(@RequestParam String name){
        return studentService.getByLastName(name);
    }
    @GetMapping("getByAge")
    public Student getByAge(@RequestParam Integer age){
        return studentService.getByAge(age);
    }
    @GetMapping("getByAgeandName")
    public Student getByAgeandName(@RequestParam Integer age,@RequestParam String FirstName){
        return studentService.getByageandFirstName(age,FirstName);
    }
    @GetMapping("getMaxAgeByActive")
    public List<StudentAgeProjection> getAge(){
        return studentService.getMaxAge();
    }
    @GetMapping("getTotalAgeByActive")
    public List<StudentAgeProjection> getAgeTotal(){
        return studentService.getTotalAge();
    }
}
