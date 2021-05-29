package org.zhouhy.spring.targets.impl;

import org.zhouhy.spring.targets.Employee;

public class Manager implements Employee {
    
    @Override
    public void work() {
        System.out.println("This is the manager's work!");
    }
}
