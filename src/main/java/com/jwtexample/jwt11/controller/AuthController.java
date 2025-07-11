package com.jwtexample.jwt11.controller;

import com.jwtexample.jwt11.dto.JwtResponse;
import com.jwtexample.jwt11.dto.LogInRequest;
import com.jwtexample.jwt11.dto.SignUpRequest;
import com.jwtexample.jwt11.service.classes.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // <--- EKLENEN SATIR
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<JwtResponse> register(@RequestBody SignUpRequest request) {
        JwtResponse response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LogInRequest request) {
        JwtResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }
}
