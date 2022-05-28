package com.website.gplxapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_quest")
public class GroupQuest {
    @Id
    private Integer id;
    private String name;
    private String list_quest;

    public GroupQuest() {
    }

    public GroupQuest(Integer id, String name, String list_quest) {
        this.id = id;
        this.name = name;
        this.list_quest = list_quest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getList_quest() {
        return list_quest;
    }

    public void setList_quest(String list_quest) {
        this.list_quest = list_quest;
    }
}
