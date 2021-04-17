package org.zhouhy.spring;


import org.junit.Test;
import org.zhouhy.spring.factory.BeanFactory;
import org.zhouhy.spring.service.AccountService;

public class CreateBeanTest {
    
    @Test
    public void createAccountServiceTest(){
        for(int i=0;i<4;i++){
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
        }        
    }
}
