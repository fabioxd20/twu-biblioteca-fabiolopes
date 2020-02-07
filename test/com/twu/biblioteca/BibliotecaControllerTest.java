package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaControllerTest {
    @Test
    public void testSuccessCheckoutMessage() {
        String successCheckoutMessage = "Thank you! Enjoy the book!";

        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        BibliotecaService.loadBooks();

        assertThat(BibliotecaController.checkoutBook(bookToRemove.getId()), is(successCheckoutMessage));
    }
}
