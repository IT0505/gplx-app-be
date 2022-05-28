package com.website.gplxapp.service;

import com.website.gplxapp.model.User;
import com.website.gplxapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
