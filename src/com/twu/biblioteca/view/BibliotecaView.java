package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

import java.util.List;

public class BibliotecaView {

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public String showListOfBooksWithAuthorAndYear() {
        BibliotecaService bibliotecaService = new BibliotecaService();

        List<Book> books = bibliotecaService.getBooks();

        StringBuilder booksAuthorAndYear = new StringBuilder ();

        for (Book book: books) booksAuthorAndYear.append(book.toString()).append("\n");

        return booksAuthorAndYear.toString ();
    }

    public String showMenuOptions() {
        return "1 - List of books";
    }

    public String showQuitMessage() {
        return "See you later!";
    }

    public String choiceMenuOption(String optionSelected) {
        switch (optionSelected)
        {
            case "0":
                return this.showQuitMessage();
            case "1":
                return this.showListOfBooksWithAuthorAndYear();
            default:
                return "Please select a valid option!";
        }
    }
}
