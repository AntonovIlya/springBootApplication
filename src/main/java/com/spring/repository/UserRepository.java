package com.spring.repository;

import com.spring.exceptions.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(User user) {
        return switch (user.getUser()) {
            case ("admin") -> new ArrayList<>(List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
            case ("user") -> new ArrayList<>(List.of(Authorities.READ));
            default -> null;
        };
    }
}
