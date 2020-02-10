package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

public class BibliotecaController {
    public static String checkoutBook(long bookId) {
        if (BibliotecaService.checkoutBook(bookId)) {
            return BibliotecaView.getMessageSuccessCheckout();
        } else {
            return BibliotecaView.getMessageUnsuccessCheckout();
        }
    }

    public static String giveBackBook(long bookId) {
        if (BibliotecaService.giveBackBook(bookId)) {
            return BibliotecaView.getMessageSuccessGiveBackBook();
        }else{
            return BibliotecaView.getMessageUnsuccessGiveBackBook();
        }
    }

    public static String handleMenuOption(String optionSelected) {
        switch (optionSelected)
        {
            case "0":
                return BibliotecaView.getQuitMessage();
            case "1":
                return BibliotecaView.getListOfBooksWithAuthorAndYear();
            case "2":
                return BibliotecaView.getCheckoutBookMessage();
            case "3":
                return BibliotecaView.getGiveBackBookMessage();
            default:
                return BibliotecaView.getDefaultMessageOptionInvalid();
        }
    }
}
