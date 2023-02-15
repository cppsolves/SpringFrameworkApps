package com.example.SampleDatabasePractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//Adds all arg constructor automatically
@NoArgsConstructor//Adds no arg constructor automatically
@Data // Adds getter and setter automatically
public class MessageCollection {
    private String errorMessage;
    private String []messageDetails;
}
