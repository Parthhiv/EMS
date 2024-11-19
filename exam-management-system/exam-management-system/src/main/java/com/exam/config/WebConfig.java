package com.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all origins (for development purposes, you can restrict to specific URLs later)
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500") // Allow only frontend's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow only specific methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow credentials like cookies
    }
}
