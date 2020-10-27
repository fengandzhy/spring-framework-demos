package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zhouhy.spring.entity.UserBean;

public class Test1 {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        UserBean userBean = (UserBean) context.getBean("userBean");
        System.out.print(userBean.toString());
    }
}
