package org.zhouhy.spring.dao;

import org.zhouhy.spring.entity.Product;

import java.util.List;


public interface ProductDao {

    void save(Product prod);
    
    List<Product> searchByProdId(String prodId);
}
