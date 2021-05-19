package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zhouhy.spring.config.MyConfiguration1;
import org.zhouhy.spring.config.UserConfig;
import org.zhouhy.spring.entity.Student;
import org.zhouhy.spring.entity.Teacher;
import org.zhouhy.spring.entity.UserBean;
import org.zhouhy.spring.entity.UserBean2;
import org.zhouhy.spring.selector.UserImportSelector;

public class ConfigurationTest {
    
    @Test
    public void configurationTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration1.class);
        UserBean userBean = applicationContext.getBean("userBean",UserBean.class);
        System.out.println(userBean.toString());

        UserBean2 userBean2 = applicationContext.getBean(UserBean2.class);
        System.out.println(userBean2.toString());
    }

    @Test
    public void enableUserConfigTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        Teacher teacher = applicationContext.getBean(Teacher.class);
        Student student = applicationContext.getBean(Student.class);
        System.out.println(teacher);
        System.out.println(student);

        Teacher teacher1 = applicationContext.getBean(Teacher.class);
        Teacher teacher2 = applicationContext.getBean(Teacher.class);
        
        System.out.println(teacher1 == teacher2);

//        UserImportSelector selector = applicationContext.getBean(UserImportSelector.class);
//        System.out.println(selector);
    }
}
