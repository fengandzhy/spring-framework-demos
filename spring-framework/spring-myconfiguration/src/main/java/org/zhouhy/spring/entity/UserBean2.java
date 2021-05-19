package org.zhouhy.spring.entity;

public class UserBean2 {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserBean2{" +
                "id=" + id +
                '}';
    }
}
