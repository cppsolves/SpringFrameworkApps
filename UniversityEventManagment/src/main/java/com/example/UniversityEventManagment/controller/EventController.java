package com.example.UniversityEventManagment.controller;

import com.example.UniversityEventManagment.model.Event;
import com.example.UniversityEventManagment.service.Ieventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("Eventmaster")
public class EventController {
    @Autowired
    Ieventservice ieventservice;
    @PostMapping("AddEvent")
    public void ADDEVENT(@RequestBody Event obj){
        ieventservice.addEvent(obj);
    }
    @PutMapping("UpdateEvent/{id}/{location}")
    public void UPDATEEVENT(@PathVariable int id,@PathVariable String location){
        ieventservice.updateEvent(id,location);
    }
    @DeleteMapping("DeleteEvent/{id}")
    public void DELETEEVENT(@PathVariable int id){
        ieventservice.deleteEvent(id);
    }
    @GetMapping("GetAllEvent")
    public List<Event> GETALLEVENT(){
        return ieventservice.getAllevent();
    }
}
