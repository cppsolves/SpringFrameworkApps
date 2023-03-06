package com.example.SampleDatabasePractice.service;

import com.example.SampleDatabasePractice.dao.StudentRepository;
import com.example.SampleDatabasePractice.dto.StudentAgeProjection;
import com.example.SampleDatabasePractice.dto.StudentAgeProjection;
import com.example.SampleDatabasePractice.exception.RecordNotFound;
import com.example.SampleDatabasePractice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student getByFirstName(String name){
        return studentRepository.findByFirstName(name).orElseThrow(()-> new RecordNotFound("Record not present"));
    }
    public Student getByLastName(String name){
        return studentRepository.findByLastName(name).orElseThrow(()->new RecordNotFound("Record not present"));
    }
    public Student getByAge(Integer age){
        return studentRepository.findByAge(age).orElseThrow(()->new RecordNotFound("Record not present"));
    }
    public Student getByageandFirstName(Integer age,String firstName){
        return studentRepository.findByAgeAndFirstName(age,firstName).orElseThrow(()->new RecordNotFound("Record not present"));
    }
    public List<StudentAgeProjection> getMaxAge(){
        return studentRepository.findMaxAgeByActive();
    }
    public List<StudentAgeProjection> getTotalAge(){
        return studentRepository.findTotalAgeByActive();
    }
}
