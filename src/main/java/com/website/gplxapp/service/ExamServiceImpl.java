package com.website.gplxapp.service;

import com.website.gplxapp.model.ExamTemplate;
import com.website.gplxapp.model.QuestDetail;
import com.website.gplxapp.model.User;
import com.website.gplxapp.repository.ExamTemplateRepository;
import com.website.gplxapp.repository.QuestDetailRepository;
import com.website.gplxapp.utilities.Global;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    QuestDetailRepository questDetailRepository;

    @Autowired
    ExamTemplateRepository examTemplateRepository;

    @Override
    public JSONArray getListQuestion() {
        Integer id = Global.getRandomInt(1, 8);
        System.out.println(id);

        Optional<ExamTemplate> examTemplate = examTemplateRepository.findById(id);
        String listID = examTemplate.get().getList_quest();

        List<Integer> ids = Global.formatStringToListID(listID);
        List<QuestDetail> tempList = questDetailRepository.findAllById(ids);

        JSONArray listQuest = Global.formatListQuestion(tempList);

        return listQuest;
    }
}
