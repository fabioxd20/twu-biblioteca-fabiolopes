package com.twu.biblioteca;

import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BibliotecaServiceTest {

    @Test
    public void testListOfBooks(){
        BibliotecaService bibliotecaService = new BibliotecaService();

        assertTrue(bibliotecaService.getBooks().size() > 0);
    }
}
