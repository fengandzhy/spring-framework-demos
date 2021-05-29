package org.zhouhy.spring.targets.impl;

import org.zhouhy.spring.targets.Employee;

public class Developer implements Employee {
    
    
    @Override
    public void work() {
        System.out.println("This is the developer's work!");    
    }
}
