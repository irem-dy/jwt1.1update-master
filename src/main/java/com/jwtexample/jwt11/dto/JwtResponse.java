package com.jwtexample.jwt11.dto;

import lombok.Data;

@Data
public class JwtResponse {
    private String token;
    private String refreshToken;
}