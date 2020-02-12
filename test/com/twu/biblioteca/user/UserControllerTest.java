package com.twu.biblioteca.user;

import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserControllerTest {
    @Test
    public void testSuccessLoginUser() {
        String login = "123-1234";
        String password = "1234";

        assertThat(UserController.login(login , password), is(true));
    }

    @Test
    public void testUnsuccessLoginUser() {
        String login = "123-1234";
        String password = "0000";

        assertThat(UserController.login(login, password), is(false));
    }

    @Test
    public void shouldReturnAStringWhenRequestCredentials() {
        String login = "123-1234";

        ByteArrayInputStream in = new ByteArrayInputStream(login.getBytes());
        System.setIn(in);

        String inpuntResponse = UserController.reciveCredentialsUser();

        assertThat(inpuntResponse, is(login));
    }
}
