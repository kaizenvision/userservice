package com.user.userservice.controller;

import com.user.userservice.entity.User;
import com.user.userservice.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){}
    @PutMapping("/update/{id}")
    public void updateUser(@RequestBody User user, @PathVariable long id){}
}
