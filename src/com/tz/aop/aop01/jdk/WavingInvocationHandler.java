package com.tz.aop.aop01.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 12:28 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class WavingInvocationHandler implements InvocationHandler {

    private Object target;

    public WavingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("// 付钱");
        Object obj = method.invoke(target,args);
        System.out.println("// 登录账目");

        return obj;
    }
}
