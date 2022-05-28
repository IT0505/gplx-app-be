package com.website.gplxapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam_template")
public class ExamTemplate {

    @Id
    private Integer id;
    private String list_quest;

    public ExamTemplate() {
    }

    public ExamTemplate(Integer id, String list_quest) {
        this.id = id;
        this.list_quest = list_quest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getList_quest() {
        return list_quest;
    }

    public void setList_quest(String list_quest) {
        this.list_quest = list_quest;
    }
}
