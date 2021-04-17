package org.zhouhy.spring.event;

import org.springframework.context.ApplicationEvent;

public class ActionEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ActionEvent(Object source) {
        super(source);
    }
}
