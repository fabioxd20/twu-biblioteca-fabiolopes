package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.Movie;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private static List<Media> medias;

    public static List<Book> loadBooksCatalog() {
        return new LinkedList<Book> (Arrays.asList(
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        ));
    }

    public static List<Movie> loadMoviesCatalog() {
        return new LinkedList<Movie> (Arrays.asList(
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        ));
    }

    public static boolean checkout(Media mediaToCheckout) {
        return true;
    }
}
