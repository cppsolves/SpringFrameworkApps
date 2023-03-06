package com.example.UniversityEventManagment.repository;

import com.example.UniversityEventManagment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IstudentRepository extends PagingAndSortingRepository<Student,Integer>, JpaRepository<Student,Integer> {
}
