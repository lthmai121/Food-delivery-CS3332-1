package com.cs3332.fooddelivery.service;

import com.cs3332.fooddelivery.model.user;
import com.cs3332.fooddelivery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<user> getUserById(String id) {
        return userRepository.findById(id);
    }

    public user createUser(user user) {
        return userRepository.save(user);
    }

    public user updateUser(String id, user user) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }

        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }

        userRepository.deleteById(id);
    }
}

