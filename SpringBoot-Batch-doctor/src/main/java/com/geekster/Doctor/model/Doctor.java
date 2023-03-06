package com.geekster.Doctor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "experience")
    private String experience;
    @Column(name = "specialized_in")
    private String specializedIn;
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL,orphanRemoval = true)
    List<Patient> patientList = new ArrayList<>();
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    public void removePatient(Patient patient){
        patientList.remove(patient);
    }
}
