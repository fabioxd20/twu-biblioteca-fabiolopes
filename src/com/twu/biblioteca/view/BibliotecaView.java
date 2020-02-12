package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Media;

import java.util.List;
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

    public static void showMedias(List<Media> medias) {
        StringBuilder sb = new StringBuilder();

        for (Media media: medias) sb.append(media.toString()).append("\n");

        System.out.println(sb.toString());
    }

    public static void showQuitMessage() {
        System.out.println( "See you later!");
    }

    public static void showMessageRequestIDCheckoutBook() {
        System.out.println("What book you want do the checkout? (Insert the ID)");
    }

    public static void showDefaultMessageOptionInvalid() {
        System.out.println("Please select a valid option!");
    }

    public static void showMessageSuccessBookCheckout() {
        System.out.println("Thank you! Enjoy the book!");
    }

    public static void showMessageSuccessMovieCheckout() {
        System.out.println("Thank you! Enjoy the movie!");
    }

    public static void showMessageUnsuccessBookCheckout() {
        System.out.println("Sorry, that book is not available");
    }

    public static void showMessageRequestBookIDGiveBack() {
        System.out.println("What book you want do the give back? (Insert the ID)");
    }

    public static void showMessageRequestMovieIDGiveBack() {
        System.out.println("What movie you want do the give back? (Insert the ID)");
    }

    public static void showMessageSuccessGiveBackBook() {
        System.out.println("Thank you for returning the book.");
    }

    public static void showMessageUnsuccessGiveBackBook() {
        System.out.println("That is not a valid book to return.");
    }

    public static void showMessageSuccessGiveBackMovie() {
        System.out.println("Thank you for returning the movie.");
    }

    public static void showMessageUnsuccessGiveBackMovie() {
        System.out.println("That is not a valid movie to return.");
    }

    public static void showMessageRequestIDCheckoutMovie() {
        System.out.println("What movie you want do the checkout? (Insert the ID)");
    }

    public static void showMessageUnsuccessMovieCheckout() {
        System.out.println("Sorry, that movie is not available");
    }
}
