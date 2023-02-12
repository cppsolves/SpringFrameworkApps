package com.example.UniversityEventManagment.service;

import com.example.UniversityEventManagment.model.Student;
import com.example.UniversityEventManagment.repository.IstudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements Istudentservice {
    @Autowired
    IstudentRepository istudentRepository;
    @Override
    public void addStudent(Student obj){
       istudentRepository.save(obj);
    }
    @Override
    public void updateStudent(int id,String department){
        Student obj = istudentRepository.findById(id).get();
        obj.setDepartment(department);
        istudentRepository.save(obj);
    }
    @Override
    public void deleteStudent(int id){
        istudentRepository.deleteById(id);
    }
    @Override
    public List<Student> getAllStudents(){
         return istudentRepository.findAll();
    }
    @Override
    public Student getStudentbyId(int id){
         return istudentRepository.findById(id).get();
    }
}
