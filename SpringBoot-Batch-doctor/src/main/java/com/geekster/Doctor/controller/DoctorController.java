package com.geekster.Doctor.controller;

import com.geekster.Doctor.Util.DoctorValidator;
import com.geekster.Doctor.model.Doctor;
import com.geekster.Doctor.service.DoctorService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("master")
public class DoctorController {
    private DoctorService doctorService;
    @Autowired
    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }
    @PostMapping("/postDoctor")
    public ResponseEntity<String> postDoc(@RequestBody String doctor){
        JSONObject jsonObject = new JSONObject(doctor);
        boolean validateEmail = DoctorValidator.validateEmail(jsonObject);
        boolean validatePhone = DoctorValidator.validatePhone(jsonObject);
        boolean validateCity = DoctorValidator.validateCity(jsonObject);
        boolean validateName = DoctorValidator.validateName(jsonObject);
        if(validatePhone&&validateCity&&validatePhone&&validateCity){
            Doctor doctor1 = new Doctor();
            doctor1.setCity(jsonObject.getString("city"));
            doctor1.setSpeciality(jsonObject.getString("speciality"));
            doctorService.addDoctor(doctor1);
        }
        return new ResponseEntity<>("Doctor saved", HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("/deleteDoctor")
    public ResponseEntity<String> deleteDoc(@RequestBody Doctor doctor){
        doctorService.deleteDoctor(doctor.getId());
        return new ResponseEntity<>("doc deleted",HttpStatusCode.valueOf(204));
    }
}
