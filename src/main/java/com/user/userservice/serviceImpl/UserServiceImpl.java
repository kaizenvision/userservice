package com.user.userservice.serviceImpl;

import com.user.userservice.entity.User;
import com.user.userservice.repositary.UserRepositary;
import com.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositary userRepositary;
    @Override
    public List<User> getAllUsers() {
        return userRepositary.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepositary.save(user);
    }
}
