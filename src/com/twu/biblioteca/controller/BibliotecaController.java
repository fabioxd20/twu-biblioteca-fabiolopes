package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

import java.util.List;
import java.util.Scanner;

public class BibliotecaController {

    private BibliotecaService bibliotecaService;

    public BibliotecaController() {
        this.bibliotecaService = new BibliotecaService();
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
            case "3":
                this.giveBackBook();
                break;
            case "4":
                this.showMoviesAvailable();
                break;
            case "5":
                this.checkoutMovie();
                break;
            case "6":
                this.giveBackMovie();
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
        List<Media> books = this.bibliotecaService.getBooksAvailableToCheckout();

        BibliotecaView.showMedias(books);
    }

    private void showMoviesAvailable() {
        List<Media> movies = this.bibliotecaService.getMoviesAvailableToCheckout();

        BibliotecaView.showMedias(movies);
    }

    private void checkoutBook() {
        BibliotecaView.showMessageRequestIDCheckoutBook();

        long bookId = Long.parseLong(getInputUser());

        Book book = this.bibliotecaService.getBook(bookId);

        if (this.bibliotecaService.checkout(book)) {
            BibliotecaView.showMessageSuccessBookCheckout();
        } else {
            BibliotecaView.showMessageUnsuccessBookCheckout();
        }
    }

    private void checkoutMovie() {
        BibliotecaView.showMessageRequestIDCheckoutMovie();

        long movieId = Long.parseLong(getInputUser());

        Movie movie = this.bibliotecaService.getMovie(movieId);

        if (this.bibliotecaService.checkout(movie)) {
            BibliotecaView.showMessageSuccessMovieCheckout();
        } else {
            BibliotecaView.showMessageUnsuccessMovieCheckout();
        }
    }

    private void giveBackBook() {
        BibliotecaView.showMessageRequestBookIDGiveBack();

        long bookId = Long.parseLong(getInputUser());

        Book book = this.bibliotecaService.getBook(bookId);

        if (this.bibliotecaService.giveBack(book)) {
            BibliotecaView.showMessageSuccessGiveBackBook();
        } else {
            BibliotecaView.showMessageUnsuccessGiveBackBook();
        }
    }

    private void giveBackMovie() {
        BibliotecaView.showMessageRequestMovieIDGiveBack();

        long movieId = Long.parseLong(getInputUser());

        Movie movie = this.bibliotecaService.getMovie(movieId);

        if (this.bibliotecaService.giveBack(movie)) {
            BibliotecaView.showMessageSuccessGiveBackMovie();
        } else {
            BibliotecaView.showMessageUnsuccessGiveBackMovie();
        }
    }

    private String getInputUser(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }

}
