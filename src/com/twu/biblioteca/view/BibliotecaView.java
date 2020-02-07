package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

import java.util.List;

public class BibliotecaView {

    public static String getWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public static String getListOfBooksWithAuthorAndYear() {
        List<Book> books = BibliotecaService.getBooks();

        StringBuilder booksAuthorAndYear = new StringBuilder();

        for (Book book: books) booksAuthorAndYear.append(book.toString()).append("\n");

        return booksAuthorAndYear.toString ();
    }

    public static String getMenuOptions() { return "1 - List of books\n2 - Checkout a book\n0 - Quit"; }

    public static String getQuitMessage() {
        return "See you later!";
    }

    public static String getCheckoutBookMessage() { return "What book you want do the checkout? (Insert the ID)"; }

    public static String getDefaultMessageOptionInvalid() { return "Please select a valid option!"; }

    public static String getMessageSuccessCheckout() { return "Thank you! Enjoy the book!"; }

    public static String getMessageMenuOptionSelected(String optionSelected) {
        switch (optionSelected)
        {
            case "0":
                return getQuitMessage();
            case "1":
                return getListOfBooksWithAuthorAndYear();
            case "2":
                return getCheckoutBookMessage();
            default:
                return getDefaultMessageOptionInvalid();
        }
    }
}
