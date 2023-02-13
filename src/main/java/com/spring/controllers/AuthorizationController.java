package com.spring.controllers;

import com.spring.exceptions.Authorities;
import com.spring.services.AuthorizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {

    AuthorizationService service;

    /*@GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {
        return service.getAuthorities(user, password);

    }*/
    @GetMapping("/authorize")
    public void getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {
        System.out.println(user + password);;

    }
}
