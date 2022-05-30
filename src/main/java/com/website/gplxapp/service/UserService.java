package com.website.gplxapp.service;

import org.json.simple.JSONObject;

import java.util.List;

public interface UserService {
    public Integer login(JSONObject userObj);
    public Integer register(JSONObject userObj);
}
