package com.website.gplxapp.model;

import com.website.gplxapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
