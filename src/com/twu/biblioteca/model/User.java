package com.twu.biblioteca.model;

public class User {

    private String login;
    private String password;
    private String name;
    private String email;
    private String phone;

    public User(String login, String password, String name, String email, String phone) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone;
    }
}
