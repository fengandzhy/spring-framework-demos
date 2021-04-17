package org.zhouhy.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.zhouhy.spring.event.ActionEvent;

public class LoginAction implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public int login(String username,String password) {
        ActionEvent event1 = new ActionEvent(username);
        ActionEvent event2 = new ActionEvent(password);
        this.applicationContext.publishEvent(event1);
        this.applicationContext.publishEvent(event2);        
        return 0;
    }
}
