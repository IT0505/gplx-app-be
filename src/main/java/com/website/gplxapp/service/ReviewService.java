package com.website.gplxapp.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface ReviewService {
    public JSONArray getListQuestion(String userID);
    public Integer saveReview(JSONObject reviewObj);
}
