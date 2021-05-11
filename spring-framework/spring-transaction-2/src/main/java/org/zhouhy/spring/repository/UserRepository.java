package org.zhouhy.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.zhouhy.spring.entity.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    
    List<User> findByUsername(String username);
    
    
}
