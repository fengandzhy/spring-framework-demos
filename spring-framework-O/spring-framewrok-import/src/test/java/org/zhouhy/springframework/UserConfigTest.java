package org.zhouhy.springframework;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zhouhy.springframework.config.UserConfig;
import org.zhouhy.springframework.entity.RoleBean;
import org.zhouhy.springframework.entity.UserBean;

public class UserConfigTest {

    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        UserBean user = context.getBean(UserBean.class);
        RoleBean role = context.getBean(RoleBean.class);

        System.out.println(user.toString());
        System.out.println(role.toString());
    }
}
