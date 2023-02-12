package com.example.UniversityEventManagment.repository;

import com.example.UniversityEventManagment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IstudentRepository extends JpaRepository<Student,Integer> {
}
