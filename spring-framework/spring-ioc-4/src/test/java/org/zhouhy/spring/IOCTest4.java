package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IOCTest4 {
    
    @Test
    public void dataSourceTest() throws SQLException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = applicationContext.getBean("c3p0",DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
