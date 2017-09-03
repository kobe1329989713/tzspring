package com.tz.aop.aop01.springAop.before;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 13:43 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] params, Object obj) throws Throwable {
        String name = String.valueOf(params[0]);
        System.out.println("早上好，" + name + ",睡的可好");
    }
}
