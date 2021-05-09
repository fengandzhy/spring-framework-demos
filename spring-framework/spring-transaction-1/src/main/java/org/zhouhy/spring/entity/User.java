package org.zhouhy.spring.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer Id;
    private String username;
    private String password;
    private double balance;
    

    public User() {
    }

    public User(String username, String password,double balance) {        
        this.username = username;
        this.password = password;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}