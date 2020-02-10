package com.twu.biblioteca.model;

public class Movie {

    private long id;
    private String name;
    private String year;
    private String director;
    private long rating;

    public Movie(long id, String name, String year, String director, long rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.getName() + "|" +this.getYear() + "|" + this.getDirector() + "|" + this.getRating() + "|" + this.getId();
    }
}
