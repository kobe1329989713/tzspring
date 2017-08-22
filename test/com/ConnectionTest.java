/**
 * tzdesk系统平台
 * tz_springmvc
 * com.tz.test
 * ConnectionTest.java
 * 创建人:xuchengfei 
 * 时间：2015年10月8日-下午11:06:56 
 * 2015潭州教育公司-版权所有
 */
package com;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.tz.dao.UserDao;
import com.tz.model.User;
import com.tz.service.UserService;
import org.apache.commons.dbcp.BasicDataSource;
//import org.jboss.weld.context.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * ConnectionTest
 * 创建人:xuchengfei 
 * 时间：2015年10月8日-下午11:06:56 
 * @version 1.0.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ConnectionTest {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;


	@Test
	public void handler() throws SQLException{
//		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/tzspring");
//		dataSource.setUsername("root");
//		dataSource.setPassword("xiaoer");

		//ioc --bean装载，存储，实例
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//讲存储的实例。我通过getBean取出来.
		BasicDataSource dataSource = (BasicDataSource)applicationContext.getBean("dataSource");
		System.out.println(dataSource.getConnection());
//
		System.out.println(dataSource.getDriverClassName());
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());

        System.out.println("=================");

        List<User> us = userService.findUsers();
        for (User u : us) {
            System.out.println(u.getId());
            System.out.println(u.getUsername());
            System.out.println(u.getPassword());
            System.out.println(u.getEmail());
        }
    }







}
