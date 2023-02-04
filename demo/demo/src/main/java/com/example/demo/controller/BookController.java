package com.example.demo.controller;

import com.example.demo.model.Book;
import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/getBook")
public class BookController
{
    @GetMapping("/msg")
    public String message()
    {
        return "hello guest Client!";
    }
}
