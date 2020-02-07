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

    public static void checkoutBook(String checkoutBookOption) {
        books.remove(Integer.parseInt(checkoutBookOption));
    }
}
