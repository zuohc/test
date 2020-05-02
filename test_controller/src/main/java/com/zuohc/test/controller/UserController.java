package com.zuohc.test.controller;

import com.zuohc.test.model.User;
import com.zuohc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    private List<User> getUserList(){
        return userService.getUserList();
    }

    @RequestMapping("/{id}")
    private User getUserById(@PathVariable("id")Integer id) {
        return userService.getUserById(id);
    }
}
