package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.MediaType;
import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private static List<Book> books;
    private static List<Movie> movies;

    public static List<Book> getBooksCatalog() {
        return books;
    }

    public static List<Movie> getMoviesCatalog() {
        return movies;
    }

    public static void loadBooks(Book[] pBooks) {
        books = new LinkedList<Book>(Arrays.asList(pBooks));
    }

    public static void loadMovies(Movie[] pMovies) {
        movies = new LinkedList<Movie>(Arrays.asList(pMovies));
    }
}
