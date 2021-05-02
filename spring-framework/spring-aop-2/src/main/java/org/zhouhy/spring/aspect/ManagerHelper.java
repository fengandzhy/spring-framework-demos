package org.zhouhy.spring.aspect;

public class ManagerHelper {

    public void beforeWork(){
        System.out.println("Before the manager's work!");
    }

    public void afterWork(){
        System.out.println("After the manager's work!"); 
    }
}
