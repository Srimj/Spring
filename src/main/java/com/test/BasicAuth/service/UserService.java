package com.test.BasicAuth.service;

import com.test.BasicAuth.entities.Users;
import com.test.BasicAuth.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public String checkUser(String username) {
        Users checkUser = userRepository.findByName(username);
        if (checkUser != null && !checkUser.getName().isEmpty()) {
            return "Welcome " + checkUser.getName();
        }
        return "User name not found";
    }

    public Users saveUser(Users inputUser){
        Users user = Users.builder()
                .id(inputUser.getId())
                .name(inputUser.getName())
                .password(inputUser.getPassword()).build();
        return userRepository.save(user);
    }
}
