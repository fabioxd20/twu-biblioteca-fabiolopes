package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

import java.util.List;

public class BibliotecaView {

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public static String showListOfBooksWithAuthorAndYear() {
        List<Book> books = BibliotecaService.getBooks();

        StringBuilder booksAuthorAndYear = new StringBuilder();

        for (Book book: books) booksAuthorAndYear.append(book.toString()).append("\n");

        return booksAuthorAndYear.toString ();
    }

    public static String showMenuOptions() { return "1 - List of books\n2 - Checkout a book\n3 - Quit"; }

    public static String showQuitMessage() {
        return "See you later!";
    }

    public static String showCheckoutBookMessage() { return "What book you want do the checkout? (Insert the position)"; }

    public static String showDefaultMessageOptionInvalid() { return "Please select a valid option!"; }

    public static String getMessageMenuOptionSelected(String optionSelected) {
        switch (optionSelected)
        {
            case "0":
                return showQuitMessage();
            case "1":
                return showListOfBooksWithAuthorAndYear();
            case "2":
                return showCheckoutBookMessage();
            default:
                return showDefaultMessageOptionInvalid();
        }
    }
}
