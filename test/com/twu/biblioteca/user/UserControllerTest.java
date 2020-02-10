package com.twu.biblioteca.user;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserControllerTest {
    @Test
    public void testSuccessLoginUser() {
        User user = new User("123-1234", "1234");

        assertThat(UserController.login(user), is(true));
    }

    @Test
    public void testUnsuccessLoginUser() {
        User user = new User("000-0000", "0000");

        assertThat(UserController.login(user), is(false));
    }
}
