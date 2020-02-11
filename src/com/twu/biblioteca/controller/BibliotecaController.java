package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.MediaType;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

import java.util.List;
import java.util.Scanner;

public class BibliotecaController {

    private BibliotecaService bibliotecaService;

    public BibliotecaController(Book[] books, Movie[] movies) {
        this.bibliotecaService = new BibliotecaService(books, movies);
    }

    public void initBiblioteca() {
        BibliotecaView.showWelcomeMessage();

        handleMenuOption(BibliotecaView.showMenuOptions());
    }

    public void handleMenuOption(String optionSelected) {
        switch (optionSelected) {
            case "0":
                this.exitAplication();
                break;
            case "1":
                this.showBooksAvailable();
                break;
            case "2":
                this.checkoutBook();
                break;
            case "3": //give back a book
                break;
            case "4":
                this.showMoviesAvailable();
                break;
            default:
                BibliotecaView.showDefaultMessageOptionInvalid();
                break;
        }

        this.handleMenuOption(BibliotecaView.showMenuOptions());
    }

    private void exitAplication() {
        BibliotecaView.showQuitMessage();
        System.exit(0);
    }

    private void showBooksAvailable() {
        List<Media> books = this.bibliotecaService.getMediasAvailableToCheckout(MediaType.BOOK);

        BibliotecaView.showMedias(books);
    }

    private void showMoviesAvailable() {
        List<Media> movies = this.bibliotecaService.getMediasAvailableToCheckout(MediaType.MOVIE);

        BibliotecaView.showMedias(movies);
    }

    private void checkoutBook() {
        BibliotecaView.showMessageRequestIDCheckoutBook();

        long bookId = Long.parseLong(getInputUser());

        Book book = this.bibliotecaService.getBookInCatalog(bookId);

        if (this.bibliotecaService.checkout(book)) {
            BibliotecaView.showMessageSuccessCheckout();
        } else {
            BibliotecaView.showMessageUnsuccessCheckout();
        }
    }

    private String getInputUser(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }

}
