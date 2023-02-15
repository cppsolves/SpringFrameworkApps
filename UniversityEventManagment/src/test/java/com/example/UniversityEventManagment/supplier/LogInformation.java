package com.example.UniversityEventManagment.supplier;

import java.util.function.Supplier;

public class LogInformation {
    public static final Supplier<String> GETREQUEST = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 1 : Sending GET Request";
        }
    };
    public static final Supplier<String> ASSERTSTATUSCODE = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 3 : Assert StatusCode = 200";
        }
    };
    public static final Supplier<String> VERFIFYRESPONSEID = new Supplier<String>() {
        @Override
        public String get() {
            return "Step - 4 : verify response contains studentId - 2";
        }
    };

    public static final Supplier<String> VERIFYLIST = new Supplier<String>() {
        @Override
        public String get() {
            return "List of Students Ids";
        }
    };



}
