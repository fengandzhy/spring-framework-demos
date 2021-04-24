package org.zhouhy.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    
    @Override
    @Value("dog")
    public void setName(String name) {
        super.setName(name);
    }
}
