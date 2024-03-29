package org.zhouhy.spring.bean;

public class User {
    private Integer Id;
    private String username;
    private String password;
    private Integer age;

    public User(Integer id, Integer age) {
        Id = id;
        this.age = age;
    }
    
    public User(Integer id, String username) {
        Id = id;
        this.username = username;
    }

    public User(String username, String password) {        
        this.username = username;
        this.password = password;
    }

    public User(String username, String password,Integer Id) {
        this.Id = Id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
