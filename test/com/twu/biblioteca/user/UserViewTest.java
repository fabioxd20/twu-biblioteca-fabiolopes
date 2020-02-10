package com.twu.biblioteca.user;

import com.twu.biblioteca.view.UserView;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserViewTest {

    @Test
    public void testMessageUserLoginRequest() {
        String loginMessage = "Please insert your library number:";

        assertThat(UserView.getLoginMessage(), is(loginMessage));
    }

    @Test
    public void testMessageUserPasswordRequest() {
        String passwordMessage = "Please insert your password:";

        assertThat(UserView.getPasswordMessage(), is(passwordMessage));
    }

    @Test
    public void testUserMessageFailLogin() {
        String loginFailMessage = "Wrong credentials";

        assertThat(UserView.getLoginFailMessage(), is(loginFailMessage));
    }

    @Test
    public void testUserMessageSuccessLogin() {
        String loginSuccessMessage = "Right credentials";

        assertThat(UserView.getLoginSuccessMessage(), is(loginSuccessMessage));
    }
}
