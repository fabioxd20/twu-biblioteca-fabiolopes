package com.twu.biblioteca;

import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BibliotecaServiceTest {

    @Test
    public void testListOfBooks(){
        BibliotecaService bibliotecaService = new BibliotecaService();

        assertThat(bibliotecaService.getBooks().size() > 0, is(true));
    }

    @Test
    public void testCheckoutABook() {
        BibliotecaService bibliotecaService = new BibliotecaService();

        String checkoutBookOption = "1";
        int expectBookListSize = bibliotecaService.getBooks().size() - 1;

        bibliotecaService.checkoutBook(checkoutBookOption);

        assertThat(bibliotecaService.getBooks().size(), is(expectBookListSize));
    }
}
