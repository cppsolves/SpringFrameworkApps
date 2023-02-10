package com.example.erpapp.service;

import com.example.erpapp.dto.StudentPercentageDTO;
import com.example.erpapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ERPService {
    public static final List<Student> list_ = new ArrayList<>();
    public List<Student> findall(){
        return list_;
    }
    public void add(Student obj){
        list_.add(obj);
    }
    public Student getstudent(int id){
        int low=0,high= list_.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(list_.get(mid).getRollno() == id) return list_.get(mid);
            else if(list_.get(mid).getRollno()<id) low = mid+1;
            else high = mid-1;
        }
        return new Student(0,"null","null",new ArrayList<>(),"null");
    }
    public List<StudentPercentageDTO> getperc(){
        List<StudentPercentageDTO> Studentperc_ = new ArrayList<>();
        for(Student obj : list_){
            List<Double> marks = obj.getMarks();
            double perc=0.0;
            for(double ref : marks){
                perc+=ref;
            }
            perc*=0.4;
            Studentperc_.add(new StudentPercentageDTO(obj.getName(),obj.getRollno(),perc));
        }
        return Studentperc_;
    }
    public StudentPercentageDTO getTopper(){
        List<StudentPercentageDTO> percentageList_ = getperc();
        double max = percentageList_.get(0).getPerc();
        StudentPercentageDTO res = percentageList_.get(0);
        for(int i=0;i<percentageList_.size();i++){
            if(percentageList_.get(i).getPerc()>max){
                max = percentageList_.get(i).getPerc();
                res = percentageList_.get(i);
            }

        }
        return res;
    }
}
