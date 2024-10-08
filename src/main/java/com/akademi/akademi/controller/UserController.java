package com.akademi.akademi.controller;

import com.akademi.akademi.dto.request.UserCreationRequest;
import com.akademi.akademi.dto.request.UserUpdateRequest;
import com.akademi.akademi.entiny.User;
import com.akademi.akademi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
       return userService.createRequest(request);
    }
    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }
//    search id user
    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId) {
        return  userService.getUser(userId);
    }
//    update user
    @PutMapping("/{userId}")
    User updtateUser(@PathVariable  String userId , @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId,request);
    }
//    delete user
    @DeleteMapping("/{userId}")
    String deleUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been deleted";
    }
}

