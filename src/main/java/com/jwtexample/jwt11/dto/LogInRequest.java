package com.jwtexample.jwt11.dto;

import lombok.Data;

@Data
public class LogInRequest {
    private String email;
    private String password;
}