package com.faq.demo.services;

import java.util.List;
import com.faq.demo.model.User;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
}
