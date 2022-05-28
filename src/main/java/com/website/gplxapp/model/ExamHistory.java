package com.website.gplxapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam_history")
public class ExamHistory {
    @Id
    private Integer id;
    private Integer user_id;
    private Integer exam_template_id;
    private Integer score;

    public ExamHistory() {
    }

    public ExamHistory(Integer user_id, Integer exam_template_id, Integer score) {
        this.user_id = user_id;
        this.exam_template_id = exam_template_id;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getExam_template_id() {
        return exam_template_id;
    }

    public void setExam_template_id(Integer exam_template_id) {
        this.exam_template_id = exam_template_id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
