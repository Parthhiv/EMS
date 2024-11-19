package com.exam.controller;

import com.exam.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, Object> request) {
        String role = (String) request.get("role");
        Long id = Long.parseLong(request.get("username").toString());
        String password = (String) request.get("password");

        boolean authenticated = authService.authenticate(role, id, password);

        return Map.of("success", authenticated);
    }
}
