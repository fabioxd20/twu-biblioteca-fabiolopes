package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

public class BibliotecaController {
    public static void checkoutBook(long bookId) {
        if (BibliotecaService.checkoutBook(bookId)) {
            BibliotecaView.showMessageSuccessCheckout();
        } else {
            BibliotecaView.showMessageUnsuccessCheckout();
        }
    }

    public static void giveBackBook(long bookId) {
        if (BibliotecaService.giveBackBook(bookId)) {
            BibliotecaView.showMessageSuccessGiveBackBook();
        }else{
            BibliotecaView.showMessageUnsuccessGiveBackBook();
        }
    }

    public static void handleMenuOption(String optionSelected) {
        switch (optionSelected) {
            case "0":
                BibliotecaView.showQuitMessage();
                System.exit(0);
                break;
            case "1":
                BibliotecaView.showListOfBooksWithAuthorAndYear();
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "2":
                if (BibliotecaService.checkoutBook(Long.parseLong(BibliotecaView.showCheckoutBookMessage()))){
                    BibliotecaView.showMessageSuccessCheckout();
                } else {
                    BibliotecaView.showMessageUnsuccessCheckout();
                }
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "3":
                if (BibliotecaService.giveBackBook(Long.parseLong(BibliotecaView.showGiveBackBookMessage()))){
                    BibliotecaView.showMessageSuccessGiveBackBook();
                } else {
                    BibliotecaView.showMessageUnsuccessGiveBackBook();
                }
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "4":
                BibliotecaView.showListofMoviesAvailable();
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            default:
                BibliotecaView.showDefaultMessageOptionInvalid();
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
        }
    }

    public static void initBiblioteca() {
        BibliotecaService.loadBooks();
        BibliotecaService.loadMovies();
        BibliotecaView.showWelcomeMessage();

        handleMenuOption(BibliotecaView.showMenuOptions());
    }

    public static boolean checkoutMovie(long movieId) {
        return BibliotecaService.checkoutMovie(movieId);
    }
}
