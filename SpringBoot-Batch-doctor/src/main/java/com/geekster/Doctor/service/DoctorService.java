package com.geekster.Doctor.service;

import com.geekster.Doctor.dao.DoctorRepository;
import com.geekster.Doctor.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    private DoctorRepository doctorRepository;
    @Autowired
    public DoctorService(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }
    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public void deleteDoctor(Integer id){
        doctorRepository.deleteById(id);
    }
}
