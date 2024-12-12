package com.test.BasicAuth.service;

import com.test.BasicAuth.entity.User;
import com.test.BasicAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.JwtBuilder;

@Service
public class JwtTokenGenerator {
    @Autowired
    private UserRepository userRepository;

    public String generateToken(User user) {
        // Use a library like io.jsonwebtoken.JwtBuilder to create a JWT token
        // containing the user's ID, username, and expiration time
        return "";
    }
}