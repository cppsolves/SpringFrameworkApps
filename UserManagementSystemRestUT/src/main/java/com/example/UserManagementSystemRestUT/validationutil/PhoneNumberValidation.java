package com.example.UserManagementSystemRestUT.validationutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static boolean isValid(String s)
    {


        Pattern p = Pattern.compile("^\\d{10}$");


        Matcher m = p.matcher(s);


        return (m.matches());
    }
}
