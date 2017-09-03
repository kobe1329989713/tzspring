package com.tz.aop.aop01.springAop.aopUpdate;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 15:02 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 *
 *
 *  aop
 *  就是你在调用哪个方法时,它会先执行哪个方法
 *
 *
 *
 *
 * <BR>
 */
public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] params, Object obj, Exception ex){
        System.out.println("========异常通知==========");
        System.out.println("method:===="+method.getName());
        System.out.println("抛出的异常是："+ex.getMessage());
        System.out.println("事务回滚....");


    }
}
