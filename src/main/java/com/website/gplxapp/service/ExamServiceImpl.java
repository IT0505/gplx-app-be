package com.website.gplxapp.service;

import com.website.gplxapp.model.ExamHistory;
import com.website.gplxapp.model.ExamTemplate;
import com.website.gplxapp.model.QuestDetail;
import com.website.gplxapp.model.User;
import com.website.gplxapp.repository.ExamHistoryRepository;
import com.website.gplxapp.repository.ExamTemplateRepository;
import com.website.gplxapp.repository.QuestDetailRepository;
import com.website.gplxapp.utilities.Global;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    QuestDetailRepository questDetailRepository;

    @Autowired
    ExamTemplateRepository examTemplateRepository;

    @Autowired
    ExamHistoryRepository examHistoryRepository;

    @Override
    public JSONObject getListQuestion() {
        Integer id = Global.getRandomInt(1, 8);
        System.out.println(id);

        Optional<ExamTemplate> examTemplate = examTemplateRepository.findById(id);
        String listID = examTemplate.get().getList_quest();

        List<Integer> ids = Global.formatStringToListID(listID);
        List<QuestDetail> tempList = questDetailRepository.findAllById(ids);

        JSONArray listQuest = Global.formatListQuestion(tempList);
        JSONObject temp = new JSONObject();
        temp.put("exam_template_id", id);
        temp.put("list_question", listQuest);

        return temp;
    }

    @Override
    public Integer saveExamScore(JSONObject examResult) {
        Integer user_id = Integer.parseInt(examResult.get("user_id").toString());
        Integer exam_template_id = Integer.parseInt(examResult.get("exam_template_id").toString());
        Integer score = Integer.parseInt(examResult.get("score").toString());
        ExamHistory examHistory = new ExamHistory(user_id, exam_template_id, score);

        ExamHistory temp = examHistoryRepository.getByUserId(user_id.toString(), exam_template_id.toString());
        if(temp == null){
            examHistoryRepository.save(examHistory);
            return 1;
        }
        else if(temp.getScore() < score){ // user_id & exam_template_id match
            temp.setScore(score);
            examHistoryRepository.save(temp);
            return 0;
        }
        return -1;
    }
}
