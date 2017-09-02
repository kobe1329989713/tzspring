package com;

import com.tz.dao.tzexam.UserDao2;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 17:07 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestHibernate {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        System.out.println("===" + context);
//
//		BasicDataSource dataSource = (BasicDataSource)context.getBean("dataSource");
//		System.out.println(dataSource.getConnection());
//
////
//		SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
//		System.out.println(sessionFactory);
//

        UserDao2 userDao = (UserDao2)context.getBean("userDao2");
        System.out.println("===" + userDao);
    }
}
