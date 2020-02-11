package com.twu.biblioteca.model;

public class Media {

    private long id;
    private String name;
    private String author;
    private String year;
    private MediaType type;

    public Media(long id, String name, String author, String year, MediaType type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MediaType getType()  { return this.type; }
}
