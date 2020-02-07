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

        String booksAuthorAndYear = "";

        for (Book book: books) {
            booksAuthorAndYear += book.toString() + "\n";
        }

        return booksAuthorAndYear;
    }

    public String showMenuOptions() {
        return "1 - List of books";
    }

    public String choiceMenuOption(int optionSelected) {
        switch (optionSelected)
        {
            case 1:
                return this.showListOfBooksWithAuthorAndYear();
            default:
                return "Please select a valid option!";
        }
    }
}
