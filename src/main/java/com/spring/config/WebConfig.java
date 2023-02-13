package com.spring.config;

import com.spring.repo.UserRepository;
import com.spring.services.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public AuthorizationService getAuthorizationService() {
        return new AuthorizationService();
    }

    @Bean
    public UserRepository getUserRepository() {
        return new UserRepository();
    }
}
