package org.zhouhy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouhy.spring.dao.ProductDao;
import org.zhouhy.spring.dao.UserDao;
import org.zhouhy.spring.entity.Product;
import org.zhouhy.spring.entity.User;
import org.zhouhy.spring.service.BuyService;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransactionTest {

    @Autowired
    private BuyService buyService;
    
    @Test
    public void saveUserTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User("Sam","123",10000.00);        
        userDao.save(user);
    }

    @Test
    public void saveProductTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = applicationContext.getBean("productDao",ProductDao.class);
        Product product = new Product("2",1000,123.00);
        productDao.save(product);
    }

    @Test
    public void searchProductTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = applicationContext.getBean("productDao",ProductDao.class);
        List<Product> products = productDao.searchByProdId("1");
        System.out.println(products.get(0));
    }

    @Test
    public void searchUserTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        List<User> users = userDao.searchByUsername("Sam");
        System.out.println(users.get(0));
    }

    @Test
    public void updateBalanceTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(7);
        user.setBalance(200);
        int a = userDao.updateBalance(user);
        System.out.println(a);
    }

    @Test
    public void updateStockTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = applicationContext.getBean("productDao",ProductDao.class);
        Product product = new Product();
        product.setId(8);
        product.setStock(5);
        int a = productDao.updateStock(product);
        System.out.println(a);
    }

    @Test
    public void buyTest(){
        buyService.buy("1",3,"Sam");
    }

    @Test
    public void buyTest1(){
        buyService.buy(3,"Sam","1");
    }
}
