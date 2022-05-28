package com.website.gplxapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quest_detail")
public class QuestDetail {
    @Id
    private Integer id;
    private String question;
    private String img_path;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private Integer correct;

    public QuestDetail() {
    }

    public QuestDetail(Integer id, String question, String img_path, String ans1, String ans2, String ans3, String ans4, Integer correct) {
        this.id = id;
        this.question = question;
        this.img_path = img_path;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }
}
