package org.zhouhy.spring.targets;

import org.springframework.stereotype.Component;

@Component
public class SayHelloService {
    
    public void say(){
        System.out.println("Hello AspectJ!");
    }
}
