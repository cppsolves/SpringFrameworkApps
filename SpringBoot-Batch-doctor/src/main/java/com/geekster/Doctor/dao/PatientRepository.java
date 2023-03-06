package com.geekster.Doctor.dao;

import com.geekster.Doctor.model.Doctor;
import com.geekster.Doctor.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {


}
