package org.zhouhy.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String prodId;
    private Integer stock;
    private double price;

    public Product() {
    }

    public Product(String prodId, Integer stock, double price){
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

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", prodId='" + prodId + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
