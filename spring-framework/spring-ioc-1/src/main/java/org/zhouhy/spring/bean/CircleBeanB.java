package org.zhouhy.spring.bean;

public class CircleBeanB {
    private Integer Id;
    private String name;
    private CircleBeanA circleBeanA;

    public CircleBeanB() {
    }

    public CircleBeanB(Integer id, String name, CircleBeanA circleBeanA) {
        Id = id;
        this.name = name;
        this.circleBeanA = circleBeanA;
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

    public CircleBeanA getCircleBeanA() {
        return circleBeanA;
    }

    public void setCircleBeanA(CircleBeanA circleBeanA) {
        this.circleBeanA = circleBeanA;
    }

    @Override
    public String toString() {
        return "CircleBeanB{" +
                "Id=" + Id +
                ", circleBeanA=" + circleBeanA +
                '}';
    }
}
