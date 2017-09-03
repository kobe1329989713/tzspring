package com.tz.aop.aop01.springAop.aopUpdate;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:32 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TranscationInvocation implements MethodBeforeAdvice {

    /*
	 * method:要执行的方法
	 * params:方法的参数
	 * obj:目标对象
	 *
	 * method.invoke(obj,params)
	 *
	 * */
    @Override
    public void before(Method method, Object[] params, Object obj) throws Throwable {
        System.out.println("事务开启了....");
        method.invoke(obj, params);
    }
}
