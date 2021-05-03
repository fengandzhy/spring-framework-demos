package org.zhouhy.spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.dao.UserDao;
import org.zhouhy.spring.entity.User;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    
    //传统的mybatis使用方法
    @Test
    public void saveTest() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);        
        SqlSession session = sqlSessionFactory.openSession();
        UserDao dao = session.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("ABC");
        user.setPassword("123456");
        dao.save(user);
        session.commit();        
    }


    //跟spring整合之后的mybatis
    @Test
    public void springMabatisSaveTest() throws IOException {
        ApplicationContext applicationContext 
                = new ClassPathXmlApplicationContext("applicationContext.xml");        
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setUsername("BCD");
        user.setPassword("885948");
        userDao.save(user);        
    }
}
