package com.twu.biblioteca;

import com.twu.biblioteca.view.BibliotecaView;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaView bibliotecaView = new BibliotecaView();

        System.out.println(bibliotecaView.showWelcomeMessage());
        System.out.println(bibliotecaView.showMenuOptions());

        Scanner scanner = new Scanner(System.in);
        int optionSelected = scanner.nextInt();

        System.out.println(bibliotecaView.choiceMenuOption(optionSelected));
    }
}
