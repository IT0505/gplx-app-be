package com.website.gplxapp.service;

import com.website.gplxapp.model.User;
import com.website.gplxapp.repository.UserRepository;
import org.json.simple.JSONObject;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public Integer login(JSONObject userObj) {
        User user = userRepository.getByUsername(userObj.get("username").toString());
        if(user != null) {
            if(BCrypt.checkpw(userObj.get("password").toString(), user.getPassword()))
                return user.getId();
        }
        return -1;
    }

    @Override
    public Integer register(JSONObject userObj) {
        User user = userRepository.getByUsername(userObj.get("username").toString());
        if(user != null) {
            return -1;
        }
        String hashPass = BCrypt.hashpw(userObj.get("password").toString(), BCrypt.gensalt(12));
        User newUser = new User(userObj.get("username").toString(), hashPass);
        userRepository.save(newUser);
        User lastUser = userRepository.getByUsername(newUser.getUsername());
        return lastUser.getId();
    }
}
