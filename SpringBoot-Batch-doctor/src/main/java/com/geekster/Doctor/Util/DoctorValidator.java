package com.geekster.Doctor.Util;

import org.json.JSONObject;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DoctorValidator {
    public static boolean validateEmail(JSONObject doctor){
        return Pattern.compile("^[a-z]+@+[a-z]+com$]").matcher(doctor.getString("email")).find();
    }
    public static boolean validatePhone(JSONObject doctor){
        return Pattern.compile("^[0-9]{10}$").matcher(doctor.getString("phone")).find();
    }
    public static boolean validateName(JSONObject doctor){
        Pattern pattern = Pattern.compile("^\\w{3,}$");
        Matcher matcher = pattern.matcher(doctor.getString("name"));
        return matcher.find();
    }
    public static boolean validateCity(JSONObject doctor){
        Pattern pattern = Pattern.compile("^\\w{1,20}$");
        Matcher matcher = pattern.matcher(doctor.getString("city"));
        return matcher.find();
    }
}
