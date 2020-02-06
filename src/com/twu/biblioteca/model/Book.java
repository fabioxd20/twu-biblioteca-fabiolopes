package com.twu.biblioteca.model;

public class Book {

    private String name;

    public Book(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
