package org.zhouhy.spring.bean;

public class Person {
    private Integer Id;
    private Room rm;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Room getRm() {
        return rm;
    }

    public void setRm(Room rm) {
        this.rm = rm;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", rm=" + rm +
                '}';
    }
}
