package com.twu.biblioteca;

import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

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
        String bookId = "1";

        BibliotecaService.loadBooks();

        int expectBookListSize = BibliotecaService.getBooks().size() - 1;

        BibliotecaService.checkoutBook(bookId);

        assertThat(BibliotecaService.getBooks().size(), is(expectBookListSize));
    }
}
