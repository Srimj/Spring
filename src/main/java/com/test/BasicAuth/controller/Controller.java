package com.test.BasicAuth.controller;

import com.test.BasicAuth.entities.Users;
import com.test.BasicAuth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@EntityScan("com.test.BasicAuth.entities")
@AllArgsConstructor
public class Controller {

    private final UserService userService;

    @PostMapping
    public String normalPostApi(@RequestBody Map<String, String> person){
        return userService.checkUser(person.get("name"));
    }

    @PostMapping("/signup")
    public Users saveApi(@RequestBody Users person){
        return userService.saveUser(person);
    }

}
