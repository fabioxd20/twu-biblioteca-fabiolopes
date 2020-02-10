package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class BibliotecaServiceTest {

    @Before
    public void init() {
        BibliotecaController.initBiblioteca();
    }

    @Test
    public void testListOfBooks(){
        assertThat(BibliotecaService.getBooksAvailable().size() > 0, is(true));
    }

    @Test
    public void testCheckoutABook() {
        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        BibliotecaService.checkoutBook(bookToRemove.getId());

        assertThat(BibliotecaService.getBooksAvailable(), not(hasItems(bookToRemove)));
    }

    @Test
    public void testListBooksCatalog() {
        assertThat(BibliotecaService.loadBooksCatalog().size() > 0, is(true));
    }

    @Test
    public void testGiveBackBook() {
        Book bookToGiveBack = new Book (1,"Book One","Author One","2001");

        BibliotecaService.checkoutBook(bookToGiveBack.getId());

        assertThat(BibliotecaService.giveBackBook(bookToGiveBack.getId()), is(true));
    }
}
