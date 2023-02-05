package com.example.demo.model;

public class URL
{
    private String username;
    private int visitCount;

    public URL(String username, int visitCount) {
        this.username = username;
        this.visitCount = visitCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
