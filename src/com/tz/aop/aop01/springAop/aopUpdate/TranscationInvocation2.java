package com.tz.aop.aop01.springAop.aopUpdate;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:53 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TranscationInvocation2 implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] params, Object obj) throws Throwable {
        System.out.println("事务开启了2222222222222222....");
//        method.invoke(obj, params);
    }
}
