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
 * 6. 关于事务的propagation 属性一般情况下默认的是REQUIRED, 当设置成@Transactional(propagation=Propagation)
 * 表名这里面的事务和外面包裹它的事务融为一体, 也就是说它融合进外面的事务当中去了.
 * 
 * 7. 本例中一如jdbc的依赖, 是为了让它找到datasource
 * 
 * 8. 关于spring 整合 Mybatis 有以下几个步骤
 *  1) 引入相关依赖, 相关依赖请参考本例
 *  2) 配置 dataSource, sqlSessionFactoryBean, scanner
 *  3) 编写相关的Dao类
 *  4) 编写Mapper.xml文件
 *  
 * 9. 事务有这么多属性@Transactional(isloation=,propagation=,readOnly=,timeout=,rollbackFor=, noRollbackFor=,)
 * 
 * 10. 关于事务的传播属性 
 *  1)propagation=REQUIRED 如果当前没有事务，就创建一个新事务，如果当前存在事务，就加入该事务，该设置是最常用的设置
 *  2)propagation=SUPPORTS 如果当前没有事务，则不开启事务，如果当前存在事务，就加入该事务，一般用在查询方法上
 *  3)propagation=REQUIRES_NEW 创建新事务, 如果外部有事务则暂停外部事务, 开启一个新的事务
 *  
 * 11. 
 *  
 *  
 * */
public class TransactionApp {
    public static void main(String[] args) {
        
    }
}
