package org.zhouhy.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey extends Animal{

    
    @Override
    @Value("monkey")
    public void setName(String name) {
        super.setName(name);
    }
}
