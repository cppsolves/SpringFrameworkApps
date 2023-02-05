package com.example.WeeklyProjectTwo.model;

public class Restaurant {
    String name;
    String address;
    String speciality;
    int totalStaff;
    double rating;

    public Restaurant(String name, String address, String speciality, int totalStaff, double rating) {
        this.name = name;
        this.address = address;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
