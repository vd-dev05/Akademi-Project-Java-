package com.akademi.akademi.service;

import com.akademi.akademi.dto.request.UserCreationRequest;
import com.akademi.akademi.dto.request.UserUpdateRequest;
import com.akademi.akademi.entiny.User;
import com.akademi.akademi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(UserCreationRequest request) {
        User user = new User();
        if (userRepository.existsByUsername(request.getUsername()))
            throw new RuntimeException("User exitsted") ;

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
    public  User updateUser(String  userId, UserUpdateRequest request) {
        User user = getUser(userId);
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return  userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String id ) {
        return userRepository.findById(id)
                .orElseThrow (() -> new RuntimeException(("User not found")));
    }

}
