package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

import java.util.List;

public class BibliotecaView {

    public static String getWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public static String getListOfBooksWithAuthorAndYear() {
        List<Book> books = BibliotecaService.getBooksAvailable();

        StringBuilder booksAuthorAndYear = new StringBuilder();

        for (Book book: books) booksAuthorAndYear.append(book.toString()).append("\n");

        return booksAuthorAndYear.toString ();
    }

    public static String getMenuOptions() {
        return "1 - List of books\n" +
            "2 - Checkout a book\n" +
            "3 - Return a book\n" +
            "4 - List of movies\n" +
            "0 - Quit";
    }

    public static String getQuitMessage() { return "See you later!"; }

    public static String getCheckoutBookMessage() { return "What book you want do the checkout? (Insert the ID)"; }

    public static String getDefaultMessageOptionInvalid() { return "Please select a valid option!"; }

    public static String getMessageSuccessCheckout() { return "Thank you! Enjoy the book!"; }

    public static String getMessageUnsuccessCheckout() { return "Sorry, that book is not available"; }

    public static String getGiveBackBookMessage() { return "What book you want do the give back? (Insert the ID)"; }

    public static String getMessageSuccessGiveBackBook() { return "Thank you for returning the book."; }

    public static String getMessageUnsuccessGiveBackBook() { return "That is not a valid book to return."; }
}
