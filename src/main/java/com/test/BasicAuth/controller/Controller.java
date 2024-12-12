package com.test.BasicAuth.controller;

import com.test.BasicAuth.entity.User;
import com.test.BasicAuth.service.UserService;
import org.antlr.v4.runtime.misc.IntegerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth/api")
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping
    public String normalApi(){
        return "Hello, I am an api";
    }

    @PostMapping
    public String normalPostApi(@RequestBody Map<String, String> person){
        return userService.checkUser(person.get("name"));
    }

    @PostMapping("/save")
    public User saveApi(@RequestBody Map<String, String> person){
        return userService.saveUser(person.get("name"), person.get("password"), Integer.parseInt(person.get("id")));
    }

}
