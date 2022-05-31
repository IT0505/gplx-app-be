package com.website.gplxapp.service;

import com.website.gplxapp.model.GroupQuest;
import com.website.gplxapp.model.QuestDetail;
import com.website.gplxapp.model.Review;
import com.website.gplxapp.model.User;
import com.website.gplxapp.repository.QuestDetailRepository;
import com.website.gplxapp.repository.ReviewRepository;
import com.website.gplxapp.utilities.Global;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    QuestDetailRepository questDetailRepository;

    public JSONArray getListQuestion(String userID){
        Review review = reviewRepository.getByUserId(userID);
        String listQuestStr = review.getList_quest();

        List<Integer> ids = Global.formatStringToListID(listQuestStr);
        List<QuestDetail> tempList = questDetailRepository.findAllById(ids);

        return Global.formatListQuestion(tempList);
    }

    @Override
    public Integer saveReview(JSONObject reviewObj) {
        Review review = reviewRepository.getByUserId(reviewObj.get("user_id").toString());
        if(review == null) {
            Review reviewTemp = new Review(Integer.parseInt(reviewObj.get("user_id").toString()), reviewObj.get("quest_id").toString());
            reviewRepository.save(reviewTemp);
            return 0;
        }
        String listStr = review.getList_quest();

        List<Integer> listArr =  Global.formatStringToListID(listStr);
        if(listArr.contains(Integer.parseInt(reviewObj.get("quest_id").toString()))) {
            return -1;
        };

        listStr = listStr + "," + reviewObj.get("quest_id").toString();
        review.setList_quest(listStr);
        reviewRepository.save(review);
        return 1;
    }
}
