package org.frank.spring.transaction;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;


import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransactionTest {

    @Resource
    private PlatformTransactionManager txManager;
    
    @Resource
    private DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;

    @Test
    public void testDelivery(){
        //定义事务隔离级别，传播行为，
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        //事务状态类，通过PlatformTransactionManager的getTransaction方法根据事务定义获取；获取事务状态后，Spring根据传播行为来决定如何开启事务
        TransactionStatus status = txManager.getTransaction(def);
        jdbcTemplate = new JdbcTemplate(dataSource);
        try {
            jdbcTemplate.update("insert into t_transtation(id) values(?)", "1");
            //提交status中绑定的事务
            txManager.commit(status);
        } catch (RuntimeException e) {
            //回滚
            txManager.rollback(status);
        }
    }
}
