package org.zhouhy.spring.dao;

import org.springframework.stereotype.Repository;
import org.zhouhy.spring.entity.User;

@Repository("userDao")
public class UserDao extends BaseDao<User>{
}
