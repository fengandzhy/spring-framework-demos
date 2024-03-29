package org.zhouhy.spring.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer Id;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer id, String username, String password) {
        Id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
