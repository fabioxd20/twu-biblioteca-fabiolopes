package com.twu.biblioteca;


import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BibliotecaViewTest {

    @Test
    public void testShowWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";

        assertThat(BibliotecaView.getWelcomeMessage(), is(welcomeMessage));
    }

    @Test
    public void testShowListOfBooksWithAuthorAndYear() {
        String listOfBooksWithAuthorAndYear = "Book One|Author One|2001|1\nBook Two|Author Two|2002|2\n";

        BibliotecaService.loadBooks();

        assertThat(BibliotecaView.getListOfBooksWithAuthorAndYear(), is(listOfBooksWithAuthorAndYear));
    }

    @Test
    public void testShowMenuOptions() {
        String menuOptions = "" +
                "1 - List of books\n" +
                "2 - Checkout a book\n" +
                "3 - Return a book\n" +
                "4 - List of movies\n" +
                "0 - Quit";

        assertThat(BibliotecaView.getMenuOptions(), is(menuOptions));
    }

    @Test
    public void testListOfBookOptionSelected() {
        String listOfBooksOption = "1";

        String listOfBooksWithAuthorAndYear = "Book One|Author One|2001|1\nBook Two|Author Two|2002|2\n";

        BibliotecaService.loadBooks();

        assertThat(BibliotecaController.handleMenuOption(listOfBooksOption), is(listOfBooksWithAuthorAndYear));
    }

    @Test
    public void testNotifyInvalidOption() {
        String invalidOption = "a";

        String invalidMessage = "Please select a valid option!";

        assertThat(BibliotecaController.handleMenuOption(invalidOption), is(invalidMessage));
    }

    @Test
    public void testQuitOptionMessage() {
        String quitOption = "0";

        String quitMessage = "See you later!";

        assertThat(BibliotecaController.handleMenuOption(quitOption), is(quitMessage));
    }

    @Test
    public void testCheckoutOptionMessage() {
        String checkoutOption = "2";

        String checkoutMessage = "What book you want do the checkout? (Insert the ID)";

        assertThat(BibliotecaController.handleMenuOption(checkoutOption), is(checkoutMessage));
    }

    @Test
    public void testGiveBackOptionMessage() {
        String checkoutOption = "3";

        String checkoutMessage = "What book you want do the give back? (Insert the ID)";

        assertThat(BibliotecaController.handleMenuOption(checkoutOption), is(checkoutMessage));
    }

}
