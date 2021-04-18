package org.zhouhy.spring.bean;

public class Employee {
    private Integer Id;
    private Manager manager;

    public Employee(Manager manager) {
        this.manager = manager;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", manager=" + manager +
                '}';
    }
}
