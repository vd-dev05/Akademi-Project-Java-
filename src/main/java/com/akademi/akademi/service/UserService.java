package com.akademi.akademi.service;

import com.akademi.akademi.dto.request.UserCreationRequest;
import com.akademi.akademi.entiny.User;
import com.akademi.akademi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(UserCreationRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
}
