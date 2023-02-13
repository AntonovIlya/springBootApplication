package com.spring.controllers;

import com.spring.exceptions.Authorities;
import com.spring.repository.User;
import com.spring.services.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {

    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        System.out.println(user.getUser());
        System.out.println(user.getPassword());
        return service.getAuthorities(user);

    }
}
