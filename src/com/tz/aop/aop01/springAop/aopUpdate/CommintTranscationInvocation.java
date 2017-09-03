package com.tz.aop.aop01.springAop.aopUpdate;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:57 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class CommintTranscationInvocation implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object obj, Method method, Object[] params, Object target) throws Throwable {
        System.out.println("执行的类:"+target.getClass().getName());
        System.out.println("执行的方法:"+method.getName());
        if(params!=null){
            for (Object object : params) {
                System.out.println("参数:====>"+String.valueOf(object));
            }
        }

        System.out.println("事务提交成功.....");
    }
}
