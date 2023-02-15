package com.example.SampleDatabasePractice.dao;

import com.example.SampleDatabasePractice.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Integer> {
}
