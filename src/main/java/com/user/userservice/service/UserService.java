package com.user.userservice.service;

import com.user.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUsers();

    public User addUser(User user);
}
