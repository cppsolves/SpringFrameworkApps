package com.example.VisitorTraking.model;

public class VisitorTracking {
    private String name;
    private int visitCount;

    public VisitorTracking(String name, int visitCount) {
        this.name = name;
        this.visitCount = visitCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
