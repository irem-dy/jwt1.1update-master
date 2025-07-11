package com.jwtexample.jwt11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    // Giriş yapan HERKES erişebilir
    @GetMapping("/auth")
    public String authenticatedEndpoint() {
        return "✅ Token varsa bu sayfayı görebilirsin.";
    }

    // Sadece ROLE_USER olanlar erişebilir
    @GetMapping("/user")
    public String userEndpoint() {
        return "🔐 Sadece USER rolüne sahipsen bu sayfayı görebilirsin.";
    }

    // Sadece ROLE_ADMIN olanlar erişebilir
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "🛡️ Bu sayfa sadece ADMIN'lere özel.";
    }
}
