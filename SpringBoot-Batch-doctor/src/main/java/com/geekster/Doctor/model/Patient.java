package com.geekster.Doctor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "disease_type")
    private String diseaseType;
    @Column(name = "gender")
    private String gender;
    @Column(name = "admit_date")
    private String admitDate;
    @ManyToOne
    @JoinColumn(name = "doctor_id",referencedColumnName = "doctor_id")
    private Doctor doctor;
}
