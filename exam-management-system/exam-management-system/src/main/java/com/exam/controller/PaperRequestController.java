package com.exam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/requests")
public class PaperRequestController {

    // Submit a new request
    @PostMapping("/coe/newrequest")
    public ResponseEntity<Map<String, String>> submitRequest(
            @RequestParam String teacherId,
            @RequestParam String superintendentId,
            @RequestParam String course,
            @RequestParam String semester,
            @RequestParam String branch,
            @RequestParam String subject,
            @RequestParam String status) {

        // Your business logic to save the request can go here
        Map<String, String> response = new HashMap<>();
        response.put("message", "Request Created Successfully");

        // Respond with a success message in JSON format
        return ResponseEntity.ok(response);
    }
}
