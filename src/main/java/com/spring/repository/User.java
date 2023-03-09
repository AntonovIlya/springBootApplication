package com.spring.repository;

import jakarta.validation.constraints.Size;

public class User {

    @Size(min = 2, max = 6)
    private String user;

    @Size(min = 4)
    private String password;

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
