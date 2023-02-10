package com.example.erpapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentPercentageDTO {
    private String name;
    private int rollNo;
    private double perc;
}
