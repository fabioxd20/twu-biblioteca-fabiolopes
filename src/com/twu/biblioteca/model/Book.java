package com.twu.biblioteca.model;

public class Book {

    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.setName(name);
        this.setAuthor(author);
        this.setYear(year);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

    @Override
    public String toString() {
        return this.getName() + "|" +this.getAuthor() + "|" + this.getYear();
    }
}
