package com.system.feedback.controller;

import com.system.feedback.entity.User;
import com.system.feedback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") BigInteger id){
        return userRepository.getOne(id);
    }

    @GetMapping("/user/auth")
    public User authUser(@RequestBody User user){
        return userRepository.getOne(user.getUid());
    }
}
