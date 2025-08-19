package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");

        // Hardcoded users (replace with DB or UserDetailsService later)
        if ("kartik".equals(username) && "1234".equals(password)) {
            String token = JwtUtil.generateToken(username, "USER");
            return Map.of("token", token);
        } else if ("admin".equals(username) && "admin123".equals(password)) {
            String token = JwtUtil.generateToken(username, "ADMIN");
            return Map.of("token", token);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
