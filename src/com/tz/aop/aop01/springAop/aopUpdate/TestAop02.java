package com.tz.aop.aop01.springAop.aopUpdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:43 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestAop02 {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/tz/aop/aop01/springAop/aopUpdate/beanAop_02.xml");
        IUservice uservice = (IUservice) context.getBean("proxy");
//        uservice.save("kobe");
        uservice.update(666);

    }
}
