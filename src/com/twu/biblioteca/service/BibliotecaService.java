package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private static List<Book> books;

    public static void loadBooks() {
        books = new LinkedList<Book> (Arrays.asList(
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        ));
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static boolean checkoutBook(long bookId) {
        try{
            return books.remove(findBookById(bookId));
        } catch (NullPointerException errorMessage) {
            return false;
        }
    }

    private static Book findBookById(long id) {
        return books.stream().filter(book -> id == (book.getId())).findFirst().orElse(null);
    }
}
