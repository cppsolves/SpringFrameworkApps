package com.example.erpapp.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
    private int rollno;
    private String name;
    private String gender;
    private List<Double> marks;
    private String city;
}
