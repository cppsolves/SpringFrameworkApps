package com.example.SampleDatabasePractice.dao;

import com.example.SampleDatabasePractice.dto.StudentAgeProjection;
import com.example.SampleDatabasePractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findByFirstName(String name);
    Optional<Student>  findByLastName(String name);
    Optional<Student> findByAge(Integer age);
    Optional<Student> findByAgeAndFirstName(Integer age,String name);
    @Query("SELECT e.active as active,max(age) as maxAge from Student e group by e.active")
    List<StudentAgeProjection> findMaxAgeByActive();
    @Query("SELECT e.active as active,sum(age) as sumAge from Student e group by e.active")
    List<StudentAgeProjection> findTotalAgeByActive();
}
