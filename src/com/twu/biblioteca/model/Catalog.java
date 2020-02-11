package com.twu.biblioteca.model;

import java.util.LinkedList;
import java.util.List;

public class Catalog {

    private List<Book> books;
    private List<Movie> movies;

    public Catalog() {}

    public Catalog(List<Book> books, List<Movie> movies) {
        this.books = books;
        this.movies = movies;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Media> getMedias() {
        List<Media> medias = new LinkedList<>();

        medias.addAll(this.books);
        medias.addAll(this.movies);

        return medias;
    }
}
