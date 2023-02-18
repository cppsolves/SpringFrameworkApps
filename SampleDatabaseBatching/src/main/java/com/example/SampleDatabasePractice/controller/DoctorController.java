package com.example.SampleDatabasePractice.controller;

import com.example.SampleDatabasePractice.model.AcknowledgeEntity;
import com.example.SampleDatabasePractice.model.Doctor;
import com.example.SampleDatabasePractice.model.MessageCollection;
import com.example.SampleDatabasePractice.service.IDoctorService;
import jakarta.annotation.Nullable;
import netscape.javascript.JSObject;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

import java.util.List;

@RestController
@RequestMapping("master")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;
    @GetMapping("findDocMoreThanten")
    public List<Doctor> FINDBYEXP(){
        return iDoctorService.findExpGreaterthenTen();
    }
    @PostMapping("addDoctor")
    public ResponseEntity<AcknowledgeEntity> ADDDOCTOR(@Nullable  @RequestBody Doctor obj){

        JSONObject json = new JSONObject(obj);

        AcknowledgeEntity acknowledgeEntity = new AcknowledgeEntity();

        if(!json.has("doctorName")){ // just for practice
            acknowledgeEntity.setErrorMessage("invalid input");
            MessageCollection[][] arr = new MessageCollection[][]{
                    {new MessageCollection("mandatory params missing",new String[]{"doctorId","DoctorName"})},
                    {new MessageCollection("invalid mobile number",new String[]{"invalid mobile number format"})}
            };
            acknowledgeEntity.setMessageDetails(arr);
            return new ResponseEntity<AcknowledgeEntity>(acknowledgeEntity,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<AcknowledgeEntity>(acknowledgeEntity,HttpStatus.OK);
    }
}
