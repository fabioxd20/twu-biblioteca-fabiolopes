package com.twu.biblioteca.view;

import java.util.Scanner;

public class BibliotecaView {

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!");
    }

    public static String showMenuOptions() {
        String menu = "1 - List of books\n" +
                "2 - Checkout a book\n" +
                "3 - Return a book\n" +
                "4 - List of movies\n" +
                "5 - Checkout a movie\n" +
                "0 - Quit";

        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        String optionSelected = scanner.next();

        return optionSelected;
    }

    public static void showQuitMessage() {
        System.out.println( "See you later!");
    }

    public static String showCheckoutBookMessage() {
        System.out.println("What book you want do the checkout? (Insert the ID)");

        Scanner scanner = new Scanner(System.in);
        String optionSelected = scanner.next();

        return  optionSelected;
    }

    public static void showDefaultMessageOptionInvalid() {
        System.out.println("Please select a valid option!");
    }

    public static void showMessageSuccessCheckout() {
        System.out.println("Thank you! Enjoy the book!");
    }

    public static void showMessageUnsuccessCheckout() {
        System.out.println("Sorry, that book is not available");
    }

    public static String showGiveBackBookMessage() {
        System.out.println("What book you want do the give back? (Insert the ID)");

        Scanner scanner = new Scanner(System.in);
        String optionSelected = scanner.next();

        return  optionSelected;
    }

    public static void showMessageSuccessGiveBackBook() {
        System.out.println("Thank you for returning the book.");
    }

    public static void showMessageUnsuccessGiveBackBook() {
        System.out.println( "That is not a valid book to return.");
    }

    public static void showCheckoutMovieMessage() {
        System.out.println("What movie you want do the checkout? (Insert the ID)");
    }
}
