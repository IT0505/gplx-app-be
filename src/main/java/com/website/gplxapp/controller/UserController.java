package com.website.gplxapp.controller;

import com.website.gplxapp.model.User;
import com.website.gplxapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    private List<User> getall() {
        return userService.getAllUser();
    }
}
