package com.website.gplxapp.utilities;

import com.website.gplxapp.model.QuestDetail;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Global {
    public static JSONArray formatListQuestion(List<QuestDetail> questDetailList) {
        JSONArray listQuestion = new JSONArray();
        for (QuestDetail questDetail : questDetailList) {
            JSONObject temp = new JSONObject();
            JSONObject question = new JSONObject();
            JSONObject answer = new JSONObject();

            question.put("content", questDetail.getQuestion());
            question.put("image", questDetail.getImg_path());

            List<String> ansList = new ArrayList<>();
            if(questDetail.getAns1() != null) ansList.add(questDetail.getAns1());
            if(questDetail.getAns2() != null) ansList.add(questDetail.getAns2());
            if(questDetail.getAns3() != null) ansList.add(questDetail.getAns3());
            if(questDetail.getAns4() != null) ansList.add(questDetail.getAns4());

            answer.put("true_answer", questDetail.getCorrect());
            answer.put("list", ansList);

            temp.put("id", questDetail.getId());
            temp.put("question", question);
            temp.put("answer", answer);

            listQuestion.add(temp);
        }
        return listQuestion;
    }

    public static List<Integer> formatStringToListID(String ids) {
        String[] temp = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : temp) {
            idList.add(Integer.parseInt(id));
        }
        return idList;
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
