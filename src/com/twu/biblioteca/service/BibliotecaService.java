package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private List<Book> books;

    public BibliotecaService() {
        loadBooks();
    }

    public void loadBooks() {
        books = new LinkedList<Book> (Arrays.asList(
                new Book("Book One","Author One","2001"),
                new Book("Book Two","Author Two","2002")
                ));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void checkoutBook(String checkoutBookOption) {
        books.remove(Integer.parseInt(checkoutBookOption));
    }
}
