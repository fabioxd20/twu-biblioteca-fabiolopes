package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;

import java.util.List;

public class BibliotecaView {

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";
    }

    public String showListBooksName() {
        BibliotecaService bibliotecaService = new BibliotecaService();

        List<Book> books = bibliotecaService.getBooks();

        String booksName = "";

        for (Book book: books) {
            booksName += book.getName() + "\n";
        }

        return booksName;
    }

    public String showListOfBooksWithAuthorAndYear() {
        BibliotecaService bibliotecaService = new BibliotecaService();

        List<Book> books = bibliotecaService.getBooks();

        String booksAuthorAndYear = "";

        for (Book book: books) {
            booksAuthorAndYear += book.getName() + "|" +
                    book.getAuthor() + "|" +
                    book.getYear() +
                    "\n";
        }

        return booksAuthorAndYear;
    }
}
