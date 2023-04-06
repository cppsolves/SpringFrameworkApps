package com.example.UniversityEventManagment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.json.JSONObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestClass {
   private String h;
   String Comment = "anshul";
    JSONObject jsonObject = new JSONObject(Comment);
}
