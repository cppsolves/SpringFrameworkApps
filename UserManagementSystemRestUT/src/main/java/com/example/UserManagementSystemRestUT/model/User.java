package com.example.UserManagementSystemRestUT.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

import java.sql.Blob;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_User")
public class User {

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "Date_Of_Birth")
    private String dateOfBirth;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone_number")
    private String phoneNumber;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Time time;


}
