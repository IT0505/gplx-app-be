package com.website.gplxapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
    @Id
    private Integer id;
    private Integer user_id;
    private String list_quest;

    public Review() {
    }

    public Review(Integer id, Integer user_id, String list_quest) {
        this.id = id;
        this.user_id = user_id;
        this.list_quest = list_quest;
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

    public String getList_quest() {
        return list_quest;
    }

    public void setList_quest(String list_quest) {
        this.list_quest = list_quest;
    }
}
