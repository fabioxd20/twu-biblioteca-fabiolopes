package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private static List<Book> books;
    private static List<Movie> movies;

    public static void loadBooks() {
        books = loadBooksCatalog();
    }
    public static void loadMovies() {
        movies = loadMoviesCatalog();
    }

    public static List<Book> getBooksAvailable() {
        return books;
    }

    public static List<Movie> getMoviesAvailable() {
        return movies;
    }

    public static boolean checkoutBook(long bookId) {
        try{
            return books.remove(findBookAvailableToCheckout(bookId));
        } catch (NullPointerException errorMessage) {
            return false;
        }
    }

    private static Book findBookAvailableToCheckout(long bookId) {
        return books.stream().filter(book -> bookId == (book.getId())).findFirst().orElse(null);
    }
    private static Book findBookAvailableInCatalog(long bookId) {
        return loadBooksCatalog().stream().filter(book -> bookId == (book.getId())).findFirst().orElse(null);
    }

    public static boolean giveBackBook(long bookId) {
        Book bookAvailableInCatalog = findBookAvailableInCatalog(bookId);

        if (bookAvailableInCatalog != null && findBookAvailableToCheckout(bookId) == null) {
            return books.add(bookAvailableInCatalog);
        } else {
            return false;
        }
    }

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
}
