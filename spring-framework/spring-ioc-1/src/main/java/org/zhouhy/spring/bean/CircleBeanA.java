package org.zhouhy.spring.bean;

public class CircleBeanA {
    private Integer Id;
    private String name;
    private CircleBeanB circleBeanB;

    public CircleBeanA() {
    }

    public CircleBeanA(Integer id, String name, CircleBeanB circleBeanB) {
        Id = id;
        this.name = name;
        this.circleBeanB = circleBeanB;
    }

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

    public CircleBeanB getCircleBeanB() {
        return circleBeanB;
    }

    public void setCircleBeanB(CircleBeanB circleBeanB) {
        this.circleBeanB = circleBeanB;
    }

    @Override
    public String toString() {
        return "CircleBeanA{" +
                "Id=" + Id +
                ", circleBeanB=" + circleBeanB +
                '}';
    }
}
