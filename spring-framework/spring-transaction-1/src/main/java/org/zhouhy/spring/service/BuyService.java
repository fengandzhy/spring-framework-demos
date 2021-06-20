package org.zhouhy.spring.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zhouhy.spring.dao.ProductDao;
import org.zhouhy.spring.dao.UserDao;
import org.zhouhy.spring.entity.Product;
import org.zhouhy.spring.entity.User;

import java.util.List;

@Service
@EnableAspectJAutoProxy(exposeProxy = true)
public class BuyService {
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private ProductDao productDao;
    
    
    //@Transactional
    public void buy(Integer quantity,String username,String prodId){
        //this.buy(prodId,quantity,username);
        ((BuyService)AopContext.currentProxy()).buy(prodId,quantity,username);
    }
    
    @Transactional
    public void buy(String prodId,Integer quantity,String username){

        List<Product> products = productDao.searchByProdId(prodId);
        Product product = products.get(0);
        int stock = product.getStock()-quantity;
        if(stock<0){
            throw new RuntimeException("库存不足！");
        }
        Product prod = new Product();
        prod.setId(product.getId());
        prod.setStock(stock);
        productDao.updateStock(prod);
        
        List<User> users = userDao.searchByUsername(username);
        User user = users.get(0);
        double balance = user.getBalance() -product.getPrice()*quantity;
        if(balance<0){
            throw new RuntimeException("余额不足！");
        }       
        User u = new User();
        u.setId(user.getId());
        u.setBalance(balance);
        userDao.updateBalance(u);
    }
}
