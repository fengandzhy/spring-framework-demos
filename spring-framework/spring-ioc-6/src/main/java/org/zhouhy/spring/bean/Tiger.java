package org.zhouhy.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tig")
public class Tiger extends Animal{
    
    @Override
    @Value("tiger")
    public void setName(String name) {
        super.setName(name);
    }
}
