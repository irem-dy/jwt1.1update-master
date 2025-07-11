package com.jwtexample.jwt11.service.interfaces;

import com.jwtexample.jwt11.dto.JwtResponse;
import com.jwtexample.jwt11.dto.LogInRequest;
import com.jwtexample.jwt11.dto.SignUpRequest;
import com.jwtexample.jwt11.entity.User;

public interface IAuthService {
    User signUp(SignUpRequest signUpRequest);

    JwtResponse logIn(LogInRequest logInRequest);
}