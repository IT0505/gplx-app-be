package com.website.gplxapp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "practice")
public class Practice {
    @Id
    private Integer id;
    private Integer user_id;
    private Integer group_id;
    private String progress;

    public Practice() {
    }

    public Practice(Integer id, Integer user_id, Integer group_id, String progress) {
        this.id = id;
        this.user_id = user_id;
        this.group_id = group_id;
        this.progress = progress;
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

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
