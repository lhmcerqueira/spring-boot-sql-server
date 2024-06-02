package org.example.controller;

import org.example.Service.MessageSender;
import org.example.Service.UserService;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageSender messageSender;

    @PostMapping
    public User addUser(@RequestBody User user) {
        User savedUser = userService.addUser(user);
        messageSender.send("User created: " + savedUser.getName());
        return savedUser;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
