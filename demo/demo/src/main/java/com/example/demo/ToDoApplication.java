package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication
{
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(ToDoApplication.class, args);
    }
}
