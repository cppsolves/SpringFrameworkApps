package com.example.UniversityEventManagment.service;

import com.example.UniversityEventManagment.model.Event;

import java.util.List;

public interface Ieventservice {
    void addEvent(Event obj);
    void updateEvent(int id,String location);
    void deleteEvent(int id);
    List<Event> getAllevent();
}
