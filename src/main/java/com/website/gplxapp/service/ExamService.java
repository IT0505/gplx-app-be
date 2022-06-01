package com.website.gplxapp.service;

import com.website.gplxapp.model.QuestDetail;
import com.website.gplxapp.model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public interface ExamService{
    JSONObject getListQuestion();
    Integer saveExamScore(JSONObject examResult);
}
