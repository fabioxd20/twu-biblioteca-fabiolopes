package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class BibliotecaServiceTest {

    @Test
    public void testListOfBooks(){
        BibliotecaService.loadBooks();

        assertThat(BibliotecaService.getBooks().size() > 0, is(true));
    }

    @Test
    public void testCheckoutABook() {
        BibliotecaService.loadBooks();

        Book bookToRemove = new Book (1,"Book One","Author One","2001");

        BibliotecaService.checkoutBook(bookToRemove.getId());

        assertThat(BibliotecaService.getBooks(), not(hasItems(bookToRemove)));
    }
}
