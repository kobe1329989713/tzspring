package com.tz.aop.aop01.springAop.aopUpdate;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:27 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 *      拦截器方法的建议
 * <BR>
 */
public class MethodInterceptorAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("执行的类："+ invocation.getThis().getClass().getName());
        Method method = invocation.getMethod();
        System.out.println("执行的方法:"+method.getName());
        //获取目标方法的参数
        Object[] params =  invocation.getArguments();
        if(params!=null){
            for (Object object : params) {
                System.out.println("参数:====>"+String.valueOf(object));
            }
        }
        System.out.println("事务开启..............");
        long stime = System.currentTimeMillis();
        Object obj = invocation.proceed();//执行具体的方法
        long etime = System.currentTimeMillis() - stime;
        System.out.println("事务提交....");
        System.out.println("=========共耗时："+etime+"ms");
        return obj;
    }
}
