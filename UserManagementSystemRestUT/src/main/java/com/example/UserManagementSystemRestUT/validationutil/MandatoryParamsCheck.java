package com.example.UserManagementSystemRestUT.validationutil;

import com.example.UserManagementSystemRestUT.jsonformatter.JsonToObject;
import org.json.JSONObject;

public class MandatoryParamsCheck {
    public static boolean paramsCheck(JSONObject jsonObject){
        if(!jsonObject.has("userName")) return false;
        if(!jsonObject.has("dateOfBirth")) return false;
        if(!jsonObject.has("email")) return false;
        if(!jsonObject.has("phoneNumber")) return false;
        if(!jsonObject.has("date")) return false;
        if(!jsonObject.has("time")) return false;
        return true;
    }
}
