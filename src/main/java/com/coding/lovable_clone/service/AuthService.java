package com.coding.lovable_clone.service;

import com.coding.lovable_clone.dto.auth.AuthResponse;
import com.coding.lovable_clone.dto.auth.LoginRequest;
import com.coding.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);

}
