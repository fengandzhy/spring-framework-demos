package org.zhouhy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zhouhy.spring.dao.ProductDao;
import org.zhouhy.spring.dao.UserDao;

public class BuyService {
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private ProductDao productDao;
    
    public void buy(String prodId,Integer quantity){
        
        
        
    }
}
