package com.website.gplxapp.service;

import com.website.gplxapp.model.GroupQuest;
import com.website.gplxapp.model.QuestDetail;
import com.website.gplxapp.repository.GroupQuestRepository;
import com.website.gplxapp.repository.QuestDetailRepository;
import com.website.gplxapp.utilities.Global;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PracticeServiceImpl implements PracticeService{
    @Autowired
    GroupQuestRepository groupQuestRepository;

    @Autowired
    QuestDetailRepository questDetailRepository;

    @Override
    public JSONArray getListQuestion(String groupID) {
        Optional<GroupQuest> groupQuest = groupQuestRepository.findById(Integer.parseInt(groupID));
        String listID = groupQuest.get().getList_quest();

        List<Integer> ids = Global.formatStringToListID(listID);
        List<QuestDetail> tempList = questDetailRepository.findAllById(ids);

        JSONArray listQuest = Global.formatListQuestion(tempList);

        return listQuest;
    }
}
