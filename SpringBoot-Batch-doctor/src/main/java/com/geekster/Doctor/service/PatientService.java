package com.geekster.Doctor.service;

import com.geekster.Doctor.dao.PatientRepository;
import com.geekster.Doctor.model.Doctor;
import com.geekster.Doctor.model.Patient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class PatientService {
    @Autowired
    PatientRepository repository;
    @Autowired
    DoctorService doctorService;
    public void savePatient(Patient patient) {
        Integer id = patient.getDoctor().getDoctorId();
        repository.save(patient);
        Doctor doctor = doctorService.getDoctorById(id);
        doctor.addPatient(patient);
        doctorService.saveDoctor(doctor);
    }
    public List<Patient> getPatients() {
        return repository.findAll();
    }
    public List<Patient> getPtatientById(Integer id){
         List<Patient> list_ = new ArrayList<>();
         list_.add(repository.findById(id).get());
         return list_;
    }
}
