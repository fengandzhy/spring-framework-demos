package org.frank.spring.transaction;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;


import javax.annotation.Resource;
import javax.sql.DataSource;

public class TransactionTest {

    @Resource
    private PlatformTransactionManager txManager;
    
    @Resource
    private DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;
}
