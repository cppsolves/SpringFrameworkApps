package com.example.UserManagementSystemRestUT.jsonformatter;

import com.example.UserManagementSystemRestUT.model.User;
import org.json.JSONObject;

import java.sql.Time;
import java.util.Date;

public class JsonToObject {
    public static User convert(JSONObject jsonObject) throws RuntimeException{
        User user = new User();
        user.setUserName((jsonObject.getString("userName")));
        user.setDateOfBirth(jsonObject.getString("dateOfBirth"));
        user.setEmail(jsonObject.getString("email"));
        user.setPhoneNumber(jsonObject.getString("phoneNumber"));
        Date date = new Date(System.currentTimeMillis());
        user.setDate(date);
        Time time = new Time(System.currentTimeMillis());
        user.setTime(time);
        return user;
    }
}
