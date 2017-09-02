package com.tz.ioc.ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 16:18 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class Test02 {
    public static void main(String[] args) {
        //第四种(注释 加载) AnnotationConfigApplicationContext
        // 就是：扫包  加注解  这两步即可
		ApplicationContext context2 = new AnnotationConfigApplicationContext("com.tz.ioc.ioc05");
		UserDao userDao = (UserDao) context2.getBean("userDao");
		userDao.svae();


//		ApplicationContext context3 = new AnnotationConfigApplicationContext(Beans.class);
//		Student student = context3.getBean(Student.class);
//		System.out.println(student.getUsername());
    }
}
