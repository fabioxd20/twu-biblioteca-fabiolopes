package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private static List<Book> books;

    public static void loadBooks() {
        books = loadCatalog();
    }

    public static List<Book> getBooks() {
        return books;
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
        return loadCatalog().stream().filter(book -> bookId == (book.getId())).findFirst().orElse(null);
    }

    public static boolean giveBackBook(long bookId) {
        Book bookAvailableInCatalog = findBookAvailableInCatalog(bookId);

        if (bookAvailableInCatalog != null && findBookAvailableToCheckout(bookId) == null) {
            return books.add(bookAvailableInCatalog);
        } else {
            return false;
        }
    }

    public static List<Book> loadCatalog() {
        return new LinkedList<Book> (Arrays.asList(
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        ));
    }
}
