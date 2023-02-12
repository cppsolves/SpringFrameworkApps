package com.example.UniversityEventManagment.service;

import com.example.UniversityEventManagment.model.Event;
import com.example.UniversityEventManagment.repository.Ieventrepository;
import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements Ieventservice {

    @Autowired
    Ieventrepository ieventrepository;
    @Override
    public void addEvent(Event obj){
        ieventrepository.save(obj);
    }
    @Override
    public void updateEvent(int id,String location){
        Event obj = ieventrepository.findById(id).get();
        obj.setEventLocation(location);
        ieventrepository.save(obj);
    }
    @Override
    public void deleteEvent(int id){
        ieventrepository.deleteById(id);
    }
    @Override
    public List<Event> getAllevent(){
       return  ieventrepository.findAll();
    }
}
