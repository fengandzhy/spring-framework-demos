package org.zhouhy.spring;

/**
 * 1. dirty read, 脏读 ⼀个事务，读取了另⼀个事务中没有提交的数据。会在本事务中产⽣数据不⼀致的问题 
 * 解决⽅案 @Transactional(isolation=Isolation.READ_COMMITTED)
 * 
 * 2. nonrepeatable read, 不可重复读  ⼀个事务中，多次读取相同的数据，但是读取结果不⼀样。会在本事务中产⽣数据不⼀致的问题
 * 解决⽅案 @Transactional(isolation=Isolation.REPEATABLE_READ)
 * 
 * 3. phantom read, 虚读 ⼀个事务中，多次对整表进⾏查询统计，但是结果不⼀样，会在本事务中产⽣数据不⼀致的问题
 * 解决⽅案 @Transactional(isolation=Isolation.SERIALIZABLE)
 * 
 * 
 * */
public class TransactionApp {
    public static void main(String[] args) {
        
    }
}
