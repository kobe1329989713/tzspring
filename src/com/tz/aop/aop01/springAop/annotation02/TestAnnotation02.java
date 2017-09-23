package com.tz.aop.aop01.springAop.annotation02;

import com.tz.aop.aop01.springAop.annotation02.impl.XiaoTianImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 16:03 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestAnnotation02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/tz/aop/aop01/springAop/annotation02/beanAop_04.xml");
        XiaoTianImpl xiaoTianImpl = (XiaoTianImpl) context.getBean("xiaoTianImpl");


        xiaoTianImpl.addPerson();
        System.out.println("===========================================");
        xiaoTianImpl.del();




    }
}
