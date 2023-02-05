package com.example.demo.service;

import com.example.demo.model.ToDo;
//import org.springframework.cglib.core.Predicate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoservice {
    private static final List<ToDo> list_ = new ArrayList<>();
    private static int count = 0;
    static{
        list_.add(new ToDo(count++,"C++",23,"Bajarne stroustrup"));
        list_.add(new ToDo(count++,"Java",45,"Colt steel"));
        list_.add(new ToDo(count++,"php",67,"Mike barnes"));
        list_.add(new ToDo(count++,"Rust",34,"Jim taylor"));
        list_.add(new ToDo(count++,"Go",20,"Jumpa Lahiri"));
    }
    public List<ToDo> findAll(){  //returns the entire data set
        return list_;
    }
    public ToDo findid(int id){ //returns the desired data set identified by a id
        int low = 0;
        int high = list_.size()-1;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(list_.get(mid).count == id) return list_.get(mid);
            if(mid < id) low = mid + 1;
            else high = mid - 1;
        }
        return new ToDo(0,"Incorrect Book-id",0,"Null");
    }
    public void Update(ToDo obj) {
        obj.count = count++;
        list_.add(obj);
    }
    public void del(int id) {
        Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
        list_.removeIf(predicate);
    }
    public void updateset(int id,ToDo obj){
        list_.get(id).setAuthor(obj.getName());
        list_.get(id).setId(obj.getId());
        list_.get(id).setName(obj.getName());
    }
}
