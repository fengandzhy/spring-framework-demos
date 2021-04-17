package org.zhouhy.spring.bean;

import java.util.*;

public class Account {
    private Integer Id;
    private String name;
    private String[] array;
    private List<String> list;
    private Set<Address> set;
    private Map<String,String> map;
    private Map<String,User> users;
    private Properties properties;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Address> getSet() {
        return set;
    }

    public void setSet(Set<Address> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", users=" + users +
                ", properties=" + properties +
                '}';
    }
}
