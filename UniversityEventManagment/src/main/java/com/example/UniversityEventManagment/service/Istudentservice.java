package com.example.UniversityEventManagment.service;

import com.example.UniversityEventManagment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface Istudentservice{
    void addStudent(Student obj);
    void updateStudent(int id,String department);
    void deleteStudent(int id);
    List<Student> getAllStudents();
    Student getStudentbyId(int id);
}
