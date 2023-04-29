package com.geekster.Doctor.service;

import com.geekster.Doctor.dao.PatientRepository;
import com.geekster.Doctor.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PatientService {
    private PatientRepository patientRepository;
    @Autowired
    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }
    public void deletePatient(Integer id){
        patientRepository.deleteById(id);
    }
}
