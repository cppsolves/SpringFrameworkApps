package com.example.UniversityEventManagment.service;

import com.example.UniversityEventManagment.model.Student;
import com.example.UniversityEventManagment.repository.IstudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    @Override
    public List<Student> findReversedSortedList(){
        Sort idesc = Sort.by(Sort.Direction.DESC,"age");
        return istudentRepository.findAll(idesc);
    }
    @Override
    public List<Student> findPaginatedList(){
        Sort idesc = Sort.by(Sort.Direction.DESC,"studentId");
        int pageNumber = 0;
        int noofRecords = 5;
        Pageable pageable = PageRequest.of(pageNumber,noofRecords,idesc);
        Page<Student> studentPage = istudentRepository.findAll(pageable);
        List<Student> studentList = studentPage.getContent();
        return studentList;
    }

}
