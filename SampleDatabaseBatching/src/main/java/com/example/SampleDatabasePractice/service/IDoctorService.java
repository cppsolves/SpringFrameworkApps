package com.example.SampleDatabasePractice.service;

import com.example.SampleDatabasePractice.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor obj);
    List<Doctor> findallDoctor();
    List<Doctor> findExpGreaterthenTen();
}
