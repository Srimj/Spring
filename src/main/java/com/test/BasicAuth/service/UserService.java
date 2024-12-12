package com.test.BasicAuth.service;

import com.test.BasicAuth.entity.User;
import com.test.BasicAuth.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String checkUser(String username) {
        User checkUser = this.userRepository.findByName(username);
        if (checkUser != null && !checkUser.getName().isEmpty()) {
            return "Welcome " + checkUser.getName();
        }
        return "User name not found";
    }

    public User saveUser(String name, String pass, int id){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(pass);
        return userRepository.save(user);
    }
}
