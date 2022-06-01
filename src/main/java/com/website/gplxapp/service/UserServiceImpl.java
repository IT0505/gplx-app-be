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
    public JSONObject login(JSONObject userObj) {
        User user = userRepository.getByUsername(userObj.get("username").toString());
        if(user != null) {
            if(BCrypt.checkpw(userObj.get("password").toString(), user.getPassword())){
                JSONObject result = new JSONObject();
                result.put("username", user.getUsername());
                result.put("id", user.getId());
                return result;
            }
        }
        return null;
    }

    @Override
    public JSONObject register(JSONObject userObj) {
        User user = userRepository.getByUsername(userObj.get("username").toString());
        if(user != null) {
            return null;
        }
        String hashPass = BCrypt.hashpw(userObj.get("password").toString(), BCrypt.gensalt(12));
        User newUser = new User(userObj.get("username").toString(), hashPass);
        userRepository.save(newUser);
        User lastUser = userRepository.getByUsername(newUser.getUsername());
        JSONObject result = new JSONObject();
        result.put("username", lastUser.getUsername());
        result.put("id", lastUser.getId());
        return result;
    }
}
