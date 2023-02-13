package com.example.UniversityEventManagment.supplier;

import java.util.function.Supplier;

public class LogInformation {
    public static Supplier<String> GETREQUEST = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 1 : Sending GET Request";
        }
    };
    public static Supplier<String> ASSERTSTATUSCODE = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 3 : Assert StatusCode = 200";
        }
    };
    public static Supplier<String> VERFIFYRESPONSEID = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 4 : verify response contains studentId - 2";
        }
    };



}
