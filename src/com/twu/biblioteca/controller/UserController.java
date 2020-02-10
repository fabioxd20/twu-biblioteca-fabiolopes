package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;
import com.twu.biblioteca.view.UserView;

public class UserController {

    public static boolean login(String login, String password) {
        User user = new User(login, password);

        return UserService.login(user);
    }

    public static String getMessageRequestLogin() {
        return UserView.getLoginMessage();
    }

    public static String getMessageRequestPassword() {
        return UserView.getPasswordMessage();
    }
}
