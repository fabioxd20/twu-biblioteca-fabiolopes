package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaService {

    private List<Book> booksList;

    public BibliotecaService() {
        loadBooks();
    }

    public void loadBooks() {
        booksList = Arrays.asList(
                new Book("Book One","Author One","2001"),
                new Book("Book Two","Author Two","2002")
                );
    }

    public List<Book> getBooks() {
        return this.booksList;
    }
}
