package org.zhouhy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhouhy.spring.entity.Product;
import org.zhouhy.spring.entity.User;
import org.zhouhy.spring.repository.ProductRepository;
import org.zhouhy.spring.repository.UserRepository;

import java.util.List;

@Service
public class BuyService {

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private UserRepository userRepository;

    public void buy(String prodId,Integer quantity,String username){
        List<Product> products = productRepository.findByProdId(prodId);
        Product product = products.get(0);
        int stock = product.getStock()-quantity;
        if(stock<0){
            throw new RuntimeException("库存不足！");
        }
        product.setStock(stock);
        productRepository.save(product);

        List<User> users = userRepository.findByUsername(username);
        User user = users.get(0);
        double balance = user.getBalance() -product.getPrice()*quantity;
        if(balance<0){
            throw new RuntimeException("余额不足！");
        }
        user.setBalance(balance);
        userRepository.save(user);
    }
}
