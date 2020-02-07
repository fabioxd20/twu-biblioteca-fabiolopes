package com.twu.biblioteca;

import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaService.loadBooks();

        System.out.println(BibliotecaView.showWelcomeMessage());

        while (true) {
            System.out.println(BibliotecaView.showMenuOptions());

            Scanner scanner = new Scanner(System.in);
            String optionSelected = scanner.next();

            System.out.println(BibliotecaView.getMessageMenuOptionSelected(optionSelected));

            switch (optionSelected)
            {
                case "0":
                    System.exit ( 0 );
                case "2":
                    scanner = new Scanner(System.in);
                    String checkoutOption = scanner.next();
                    BibliotecaService.checkoutBook (checkoutOption);
            }
        }
    }
}
