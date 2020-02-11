package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.BibliotecaView;

public class BibliotecaController {
    public static void handleMenuOption(String optionSelected) {
        switch (optionSelected) {
            case "0":
                BibliotecaView.showQuitMessage();
                System.exit(0);
                break;
            case "1":
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "2": //checkout a book
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "3": //give back a book
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            case "4":
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
            default:
                BibliotecaView.showDefaultMessageOptionInvalid();
                handleMenuOption(BibliotecaView.showMenuOptions());
                break;
        }
    }

    public static void initBiblioteca() {
        BibliotecaView.showWelcomeMessage();

        handleMenuOption(BibliotecaView.showMenuOptions());
    }
}
