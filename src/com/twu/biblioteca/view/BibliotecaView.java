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

        StringBuilder booksAuthorAndYear = new StringBuilder();

        for (Book book: books) booksAuthorAndYear.append(book.toString()).append("\n");

        return booksAuthorAndYear.toString ();
    }

    public String showMenuOptions() { return "1 - List of books\n2 - Checkout a book"; }

    public String showQuitMessage() {
        return "See you later!";
    }

    public String showCheckoutBookMessage() { return "What book you want do the checkout? (Insert the position)"; }

    public String showDefaultMessageOptionInvalid() { return "Please select a valid option!"; }

    public String getMessageMenuOptionSelected(String optionSelected) {
        switch (optionSelected)
        {
            case "0":
                return this.showQuitMessage();
            case "1":
                return this.showListOfBooksWithAuthorAndYear();
            case "2":
                return this.showCheckoutBookMessage();
            default:
                return this.showDefaultMessageOptionInvalid();
        }
    }
}
