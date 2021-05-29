package org.zhouhy.spring.targets.impl;

import org.springframework.stereotype.Component;
import org.zhouhy.spring.targets.Calculator;

@Component("calculator")
public class CalculatorImpl implements Calculator {
    
    @Override
    public int add(int i, int j) {
        System.out.println("In the add method i="+i+",j="+j);
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("In the sub method i="+i+",j="+j);
        return i-j;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("In the div method i="+i+",j="+j);
        return i/j;
    }
}
