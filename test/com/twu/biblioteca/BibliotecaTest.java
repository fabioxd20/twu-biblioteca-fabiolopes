package com.twu.biblioteca;


import com.twu.biblioteca.service.BibliotecaService;
import com.twu.biblioteca.view.BibliotecaView;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void testShowWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showWelcomeMessage(), is(welcomeMessage));
    }

    @Test
    public void testListOfBooks(){
        BibliotecaService bibliotecaService = new BibliotecaService();

        bibliotecaService.loadBooks();

        assertTrue(bibliotecaService.getBooks().size() > 0);
    }

    @Test
    public void testShowListOfBooks() {
        String listOfBooksMessage = "Book One\nBook Two\n";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showListOfBooks(), is(listOfBooksMessage));
    }
}
