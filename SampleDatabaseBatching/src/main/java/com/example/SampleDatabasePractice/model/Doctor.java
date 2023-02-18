package com.example.SampleDatabasePractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Integer integerId;
    @Column(name="doctor_name")
    private String doctorName;
    @Column(name = "experience")
    private int experience;
    @Column(name = "specialized_in")
    private String specialization;
}
