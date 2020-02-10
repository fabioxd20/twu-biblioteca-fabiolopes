package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaControllerTest {

    @Before
    public void init() {
        BibliotecaController.initBiblioteca();
    }

    @Test
    public void testSuccessCheckoutMessage() {
        String successCheckoutMessage = "Thank you! Enjoy the book!";

        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        assertThat(BibliotecaController.checkoutBook(bookToRemove.getId()), is(successCheckoutMessage));
    }

    @Test
    public void testSuccessCheckout() {
        Movie movieToCheckout = new Movie(2,"Movie Two","2002","Director Two", 8);

        assertThat(BibliotecaController.checkoutMovie(movieToCheckout.getId()), is(true));
    }


    @Test
    public void testUnsuccessCheckoutMessage() {
        String unsuccessCheckoutMessage = "Sorry, that book is not available";

        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        BibliotecaController.checkoutBook(bookToRemove.getId());

        assertThat(BibliotecaController.checkoutBook(bookToRemove.getId()), is(unsuccessCheckoutMessage));
    }

    @Test
    public void testSuccessGiveBackBookMessage() {
        String successMessage = "Thank you for returning the book.";

        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        BibliotecaController.checkoutBook(bookToRemove.getId());

        assertThat(BibliotecaController.giveBackBook(bookToRemove.getId()), is(successMessage));
    }

    @Test
    public void testUnsuccessGiveBackBookMessage() {
        String successMessage = "That is not a valid book to return.";

        Book bookToRemove = new Book (6,"Book invalid","Author invalid","2001");

        assertThat(BibliotecaController.giveBackBook(bookToRemove.getId()), is(successMessage));
    }
}
