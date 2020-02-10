package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;

public class UserController {

    public static boolean login(User user) {
        return UserService.login(user);
    }

}
