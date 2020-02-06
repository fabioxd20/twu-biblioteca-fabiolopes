package com.twu.biblioteca;


import com.twu.biblioteca.view.BibliotecaView;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BibliotecaViewTest {

    @Test
    public void testShowWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showWelcomeMessage(), is(welcomeMessage));
    }

    @Test
    public void testShowListOfBooksWithAuthorAndYear() {
        String listOfBooksWithAuthorAndYearMessage = "Book One|Author One|2001\nBook Two|Author Two|2002\n";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showListOfBooksWithAuthorAndYear(), is(listOfBooksWithAuthorAndYearMessage));
    }

    @Test
    public void testShowMenuOptions() {
        String menuOptions = "1 - List of books";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showMenuOptions(), is(menuOptions));
    }
}
