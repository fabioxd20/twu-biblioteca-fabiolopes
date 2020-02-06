package com.twu.biblioteca;

import com.twu.biblioteca.view.BibliotecaView;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaView bibliotecaView = new BibliotecaView();

        System.out.println(bibliotecaView.showWelcomeMessage());
        System.out.println(bibliotecaView.showListOfBooks());
    }
}
