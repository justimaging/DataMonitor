//package com.teligen.datamonitor.config;
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
///**
// * 数据源配置
// */
//@Configuration
//public class DataSourceConfig {
//
//    @Bean(name = "dataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.druid")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }
//
//
//    /**
//     * 配置事务管理器
//     */
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "mybatis.configuration")
//    public org.apache.ibatis.session.Configuration mybatisConfiguration(){
//        return  new org.apache.ibatis.session.Configuration();
//    }
//    /**
//     *  **这里这里**
//     */
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource,org.apache.ibatis.session.Configuration config) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//
//        sqlSessionFactoryBean.setConfiguration(config);
//        //sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
//        //sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
//        return sqlSessionFactoryBean.getObject();
//
//    }
//}
