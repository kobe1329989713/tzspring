package com.tz.aop.aop01.springAop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 15:34 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestAop04 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/tz/aop/aop01/springAop/annotation/beanAop_03.xml");
        UesrServiceImpl uesrService = (UesrServiceImpl) context.getBean("uesrServiceImpl");
        uesrService.saveUser();
        uesrService.updateUser();
        uesrService.findUser();
    }
}
