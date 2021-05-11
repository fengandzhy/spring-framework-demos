package org.zhouhy.spring.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.zhouhy.spring.entity.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer>,JpaSpecificationExecutor<Product> {

    List<Product> findByProdId(String prodId);
}
