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
        String listOfBooksWithAuthorAndYear = "Book One|Author One|2001\nBook Two|Author Two|2002\n";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showListOfBooksWithAuthorAndYear(), is(listOfBooksWithAuthorAndYear));
    }

    @Test
    public void testShowMenuOptions() {
        String menuOptions = "1 - List of books\n2 - Checkout a book";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showMenuOptions(), is(menuOptions));
    }

    @Test
    public void testListOfBookOptionSelected() {
        String listOfBooksOption = "1";

        String listOfBooksWithAuthorAndYear = "Book One|Author One|2001\nBook Two|Author Two|2002\n";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.getMessageMenuOptionSelected(listOfBooksOption), is(listOfBooksWithAuthorAndYear));
    }

    @Test
    public void testNotifyInvalidOption() {
        String invalidOption = "a";

        String invalidMessage = "Please select a valid option!";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.getMessageMenuOptionSelected(invalidOption), is(invalidMessage));
    }

    @Test
    public void testQuitOptionMessage() {
        String quitOption = "0";

        String quitMessage = "See you later!";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.getMessageMenuOptionSelected(quitOption), is(quitMessage));
    }

    @Test
    public void testCheckoutOptionMessage() {
        String checkoutOption = "2";

        String checkoutMessage = "What book you want do the checkout? (Insert the position)";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.getMessageMenuOptionSelected(checkoutOption), is(checkoutMessage));
    }
}
