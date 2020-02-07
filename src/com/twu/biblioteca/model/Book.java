package com.twu.biblioteca.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private long id;
    private String name;
    private String author;
    private String year;

    public Book(long id, String name, String author, String year) {
        this.setId(id);
        this.setName(name);
        this.setAuthor(author);
        this.setYear(year);
    }

    private void setId(long id) { this.id = id; }

    public void setAuthor(String author) { this.author = author; }

    public String getAuthor() {
        return this.author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getId() { return this.id; }

    @Override
    public String toString() {
        return this.getName() + "|" +this.getAuthor() + "|" + this.getYear() + "|" + this.getId();
    }
}
