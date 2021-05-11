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
 * 4. 关于这个事务配置有两个部分
 *  1) 先配置transactionManager
 *  2) 在tx:annotation-driven 中注入transactionManager
 *  3) 在相应的方法上加入@Transactional
 * 
 * 5. 在某个方法上加入@Transactional的意义就在于在这个方法里的所有数据库操作要么同时成功要么同时失败,
 * 例如这里的例子, 当扣除余额失败的时候, 扣除库存也必然失败.
 * 
 * 6. 关于食物的propagation 属性一般情况下默认的是REQUIRED, 当设置成@Transactional(propagation=Propagation)
 * 表名这里面的事务和外面包裹它的事务融为一体, 也就是说它融合进外面的事务当中去了.
 * 
 * 
 * 
 * */
public class TransactionApp {
    public static void main(String[] args) {
        
    }
}
