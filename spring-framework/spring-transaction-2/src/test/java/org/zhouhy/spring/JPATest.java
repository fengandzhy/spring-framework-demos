package org.zhouhy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouhy.spring.entity.Product;
import org.zhouhy.spring.repository.ProductRepository;
import org.zhouhy.spring.service.BuyService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JPATest {

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private BuyService buyService;
    
    @Test
    public void searchProductTest(){
//        ApplicationContext applicationContext
//                = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ProductRepository productDao = applicationContext.getBean("productRepository",ProductRepository.class);
//        List<Product> products = productDao.findByProdId("1");
//        System.out.println(products.get(0));
        List<Product> products =  productRepository.findByProdId("1");
        System.out.println(products.get(0));        
    }

    @Test
    public void buyTest(){
        buyService.buy("1",3,"Sam");
    }
}
