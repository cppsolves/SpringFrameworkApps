package com.example.UserManagementSystemRestUT.validationutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirth {
    public static boolean isValidDate(String d)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)d);
        return matcher.matches();
    }
}
