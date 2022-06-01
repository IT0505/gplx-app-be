package com.website.gplxapp.service;

import org.json.simple.JSONObject;

import java.util.List;

public interface UserService {
    public JSONObject login(JSONObject userObj);
    public JSONObject register(JSONObject userObj);
}
