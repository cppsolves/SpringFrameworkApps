package com.example.SampleDatabasePractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AcknowledgeEntity {
    private String errorMessage;
    private MessageCollection[][]messageDetails;
}
