package org.zhouhy.spring;

/**
 * 1. 关于spring 整合 jpa 做到以下几个步骤
 *  1) 引入相关jar包
 *  2) 配置dataSource, entityManagerFactory, transactionManager, jpa:repositories
 *  3) 写repository 和 entity 
 * 
 * 2. 关于xml文件中配置事务也分成以下几个步骤
 *  1) 先配置transactionManager
 *  2) 在配置tx:advice 这里的tx:advice 实际上就是一个aspect 就是准备织入target的逻辑
 *  3) 然后再配置aop:config
 *  
 *  
 *  
 *  
 * */
public class TransactionApp2 {
    public static void main(String[] args) {
        
    }
}
