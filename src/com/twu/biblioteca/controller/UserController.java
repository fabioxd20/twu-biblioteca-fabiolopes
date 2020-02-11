package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;
import com.twu.biblioteca.view.UserView;

public class UserController {

    public static boolean login(String login, String password) {
        User user = new User(login, password);

        UserService userService = new UserService();

        return userService.login(user);
    }
}
