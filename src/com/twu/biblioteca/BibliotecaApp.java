package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.view.UserView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Book[] books = {
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        };

        Movie[] movies = {
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        };

        BibliotecaController bibliotecaController = new BibliotecaController(books, movies);

        bibliotecaController.initBiblioteca();
    }
}
