package com.example.demo.model;

public class Book
{
    String name;
    int id;
    String author;

    public Book(String name, int id, String author) {

        this.name = name;
        this.id = id;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
