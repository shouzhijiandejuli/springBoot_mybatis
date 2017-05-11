package com.example;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
/**
 * 
 * @ClassName: Application 
 * @Description: SpringBoot Application 
 * @author: guoconglin
 * @date: 2017年5月10日 下午2:16:57
 */
//@EnableAutoConfiguration //Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
@SpringBootApplication  //注解添加到一个 @Configuration 类上来选择自动配置。same as @Configuration @EnableAutoConfiguration @ComponentScan  
//@ComponentScan // @ComponentScan 注解自动收集所有的Spring组件
@MapperScan("com.example.dao") //自动扫描。mybatis
public class Application {
    /**
     * 日志输出
     */
    private static Logger logger = Logger.getLogger(Application.class);
    
    /**
     * DataSource配置
     */
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }
    
  //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
 
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
 
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
 
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
 
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
       logger.info("============= SpringBoot Start Success =============");
       
    }
}
