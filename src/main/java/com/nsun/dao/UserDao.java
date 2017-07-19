package com.nsun.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * Created by wangzy on 2017/7/19.
 */
public class UserDao {

    public static void main(String[] args) throws PropertyVetoException {

        /**
         * c3p0连接池数据源配置
         * 1.创建dataSources连接池对象
         * 2.初始化连接池的4项基本配置(4项基本配置是所有种类的连接池都必须配置的)
         *  a.驱动名称 DriverClass
         *  b.数据库地址 JdbcUrl
         *  c.用户名 User
         *  d.密码 Password
         */
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssh");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        // 创建模板工具类
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        jdbcTemplate.update("insert into person(username,address)values(?,?)", "tom","999");
    }
}
