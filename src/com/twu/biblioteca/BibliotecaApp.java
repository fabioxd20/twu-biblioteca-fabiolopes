package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaService.loadBooks();

        System.out.println(BibliotecaView.getWelcomeMessage());

        while (true) {
            System.out.println(BibliotecaView.getMenuOptions());

            Scanner scanner = new Scanner(System.in);
            String optionSelected = scanner.next();

            System.out.println(BibliotecaView.getMessageMenuOptionSelected(optionSelected));

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
            }
        }
    }
}
