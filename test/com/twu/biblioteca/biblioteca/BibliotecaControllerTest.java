package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

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
    public void testSuccessMovieCheckout() {
        Movie movieToCheckout = new Movie(2,"Movie Two","2002","Director Two", 8);

        assertThat(BibliotecaController.checkoutMovie(movieToCheckout.getId()), is(true));
    }

    @Test
    public void testSuccessBookCheckoutWithLogin() {
        String successCheckoutMessage = "Thank you! Enjoy the book!";
        User userToLogin = new User("123-1234", "1234");
        Book bookToCheckout = new Book (1,"Book One","Author One","2001");

        assertThat(BibliotecaController.checkoutBook(userToLogin, bookToCheckout.getId()), is(successCheckoutMessage));
    }

    @Test
    public void testUnsuccessBookCheckoutWithLogin() {
        String successCheckoutMessage = "Sorry, that book is not available";
        User userToLogin = new User("000-1234", "1234");
        Book bookToCheckout = new Book (1,"Book One","Author One","2001");

        assertThat(BibliotecaController.checkoutBook(userToLogin, bookToCheckout.getId()), is(successCheckoutMessage));
    }
}
