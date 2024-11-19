package com.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for testing purposes
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/**").permitAll() // Permit all requests to the /api/coe endpoint
                        .anyRequest().authenticated() // Authenticate all other requests
                )
                .httpBasic(httpBasic -> httpBasic.disable()); // Enable HTTP Basic Authentication

        return http.build();
    }
}
