package org.zhouhy.spring.bean;

public class Manager extends Employee{
    private Developer developer;

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }   

    public Manager() {
    }

    public Manager(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "developer=" + developer +
                '}';
    }
}
