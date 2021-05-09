package org.zhouhy.spring.entity;

import java.io.Serializable;

public class Product implements Serializable {
    
    private Integer Id;
    private String prodId;
    private Integer stock;
    private double price;

    
    
    public Product(String prodId,Integer stock,double price){
        this.prodId = prodId;
        this.stock = stock;
        this.price = price;
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
