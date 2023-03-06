package com.geekster.Doctor.service;

import com.geekster.Doctor.dao.DoctorRepository;
import com.geekster.Doctor.model.Doctor;
import com.geekster.Doctor.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public Doctor saveDoctor(Doctor doctor) {
        String doctorName = doctor.getDoctorName();
        doctorName = "Dr. " + doctorName;
        doctor.setDoctorName(doctorName);
        return repository.save(doctor);
    }

    public List<Doctor> getDoctor(String doctorId) {

        List<Doctor> doctorList;

        if(null != doctorId) {
            doctorList = new ArrayList<>();
            doctorList.add(repository.findById(Integer.valueOf(doctorId)).get());
        } else {
            doctorList = repository.findAll();
        }
        return doctorList;
    }
    public Doctor getDoctorById(Integer doctorId) {
        return repository.findById(Integer.valueOf(doctorId)).get();
    }
    public List<Patient> getPatientsbyDocId(int docid){
        Doctor doctor = repository.findById(docid).get();
        return doctor.getPatientList();
    }
}
