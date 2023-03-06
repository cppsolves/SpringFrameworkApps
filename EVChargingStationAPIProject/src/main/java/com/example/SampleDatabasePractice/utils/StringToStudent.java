package com.example.SampleDatabasePractice.utils;

import com.example.SampleDatabasePractice.model.Student;
import org.json.JSONObject;
import java.time.ZonedDateTime;

public class StringToStudent {
    public static Student convert(String student){
        JSONObject jsonObject = new JSONObject(student);
        Student student1 = new Student();
        student1.setFirstName(jsonObject.getString("firstName"));
        student1.setLastName(jsonObject.getString("lastName"));
        student1.setAge(jsonObject.getInt("age"));
        student1.setActive(jsonObject.getBoolean("active"));
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        student1.setAdmissionDate(zonedDateTime);
        return student1;
    }
}
