package org.zhouhy.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bear extends Animal{

    @Override
    @Value("bear")
    public void setName(String name) {
        super.setName(name);
    }
}
