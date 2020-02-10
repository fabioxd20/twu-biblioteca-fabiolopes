package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaControllerTest {

    @Before
    public void init() {
        BibliotecaService.loadBooks();
        BibliotecaService.loadMovies();
    }

    @Test
    public void testSuccessMovieCheckout() {
        Movie movieToCheckout = new Movie(2,"Movie Two","2002","Director Two", 8);

        assertThat(BibliotecaController.checkoutMovie(movieToCheckout.getId()), is(true));
    }
}
