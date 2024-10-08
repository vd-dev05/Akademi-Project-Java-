package com.akademi.akademi.controller;

import com.akademi.akademi.dto.request.UserCreationRequest;
import com.akademi.akademi.entiny.User;
import com.akademi.akademi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
       return userService.createRequest(request);
    }
}
