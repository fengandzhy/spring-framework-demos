package org.zhouhy.spring.bean;

public class Manager {
    private Integer Id;
    private String name;

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

    @Override
    public String toString() {
        return "Manager{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
