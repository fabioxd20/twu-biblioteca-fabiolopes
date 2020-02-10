package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaController.initBiblioteca();

        System.out.println(BibliotecaController.getWelcomeMessage());

        while (true) {
            System.out.println(BibliotecaController.getMenuOptions());

            Scanner scanner = new Scanner(System.in);
            String optionSelected = scanner.next();

            System.out.println(BibliotecaController.handleMenuOption(optionSelected));

            switch (optionSelected)
            {
                case "0":
                    System.exit ( 0 );
                    break;
                case "2":
                    scanner = new Scanner(System.in);
                    long checkoutOption = scanner.nextLong();
                    System.out.println(BibliotecaController.checkoutBook(checkoutOption));
                    break;
                case "3":
                    scanner = new Scanner(System.in);
                    long giveBackOption = scanner.nextLong();
                    System.out.println(BibliotecaController.giveBackBook(giveBackOption));
                    break;
                case "5":
                    scanner = new Scanner(System.in);
                    long checkoutMovieOption = scanner.nextLong();
                    System.out.println(BibliotecaController.checkoutMovie(checkoutMovieOption));
                    break;
            }
        }
    }
}
