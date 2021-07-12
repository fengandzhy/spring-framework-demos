package org.zhouhy.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.zhouhy.spring.event.ActionEvent;

@Slf4j
public class ActionListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ActionEvent){
            System.out.println(event);
            log.info(event.toString());
        }
    }
}
