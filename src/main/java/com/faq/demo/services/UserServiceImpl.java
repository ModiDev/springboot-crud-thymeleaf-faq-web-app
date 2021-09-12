package com.faq.demo.services;

import java.util.List;

import com.faq.demo.model.User;
import com.faq.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
