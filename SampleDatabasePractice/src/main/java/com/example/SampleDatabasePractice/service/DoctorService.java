package com.example.SampleDatabasePractice.service;

import com.example.SampleDatabasePractice.dao.DoctorRepository;
import com.example.SampleDatabasePractice.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
@Service
public class DoctorService implements IDoctorService{
    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public void addDoctor(Doctor obj){
        doctorRepository.save(obj);
    }
    @Override
    public List<Doctor> findallDoctor(){
     return (List<Doctor>) doctorRepository.findAll();
    }
    @Override
    public List<Doctor> findExpGreaterthenTen(){
        List<Doctor> list_ = this.findallDoctor();
        List<Doctor> answer = new ArrayList<>();
        for(Doctor doctor:list_){
            if(doctor.getExperience() > 10) answer.add(doctor);
        }
        return answer;
    }
}
