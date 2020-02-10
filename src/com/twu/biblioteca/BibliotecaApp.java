package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.view.UserView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaController.initBiblioteca();

        System.out.println(BibliotecaController.getWelcomeMessage());

        while (true) {
            System.out.println(BibliotecaController.getMenuOptions());

            Scanner scanner = new Scanner(System.in);
            String optionSelected = scanner.next();

            if (optionSelected.equals("2") || optionSelected.equals("3")){
                System.out.println(UserController.getMessageRequestLogin());
                scanner = new Scanner(System.in);
                String login = scanner.next();
                System.out.println(UserController.getMessageRequestPassword());
                scanner = new Scanner(System.in);
                String password = scanner.next();

                if (UserController.login(login, password)) {
                    System.out.println(UserView.getLoginSuccessMessage());
                } else {
                    System.out.println(UserView.getLoginFailMessage());
                    optionSelected = "";
                }
            }
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
