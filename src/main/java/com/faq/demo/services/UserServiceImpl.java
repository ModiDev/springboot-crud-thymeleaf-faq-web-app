package com.faq.demo.services;

import java.util.List;

import com.faq.demo.model.User;
import com.faq.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @Override
    public void saveUser(User user) {
        this.userRepository.save(user);      
    }
    
}
