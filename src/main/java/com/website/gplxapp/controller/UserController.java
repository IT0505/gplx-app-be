package com.website.gplxapp.controller;

import com.website.gplxapp.model.User;
import com.website.gplxapp.service.UserService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    private Integer login(@RequestBody JSONObject userObj) {
        return userService.login(userObj);
    }

    @PostMapping("/register")
    private Integer register(@RequestBody JSONObject userObj) {
        return userService.register(userObj);
    }
}
