package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

public class BibliotecaView {

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public Object showListOfBooks() {
        BibliotecaService bibliotecaService = new BibliotecaService();

        String booksName = "";

        for (Book book: bibliotecaService.getBooks()) {
            booksName += book.getName() + "\n";
        }

        return booksName;
    }
}
