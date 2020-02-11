package com.twu.biblioteca.model;

public class Movie extends Media {

    private long rating;

    public Movie(long id, String name, String author, String year, long rating) {
        super(id, name, author, year, MediaType.MOVIE);

        this.rating = rating;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.getName() + "|" +this.getYear() + "|" + this.getAuthor() + "|" + this.getRating() + "|" + this.getId();
    }
}
