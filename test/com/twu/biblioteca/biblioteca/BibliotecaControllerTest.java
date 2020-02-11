package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

public class BibliotecaControllerTest {

    private BibliotecaController bibliotecaController;

    @Before
    public void init() {
        Book[] books = {
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        };

        Movie[] movies = {
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        };

        this.bibliotecaController = new BibliotecaController(books, movies);
    }
}
