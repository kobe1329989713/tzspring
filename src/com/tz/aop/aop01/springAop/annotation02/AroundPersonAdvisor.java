package com.tz.aop.aop01.springAop.annotation02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 16:24 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Aspect
@Component
public class AroundPersonAdvisor {

    @Around("execution(public void addPerson())")
    public void aroundadvice(ProceedingJoinPoint joinPoint) throws Throwable{
        Object[] params = joinPoint.getArgs();
        System.out.println("参数======"+params);
        System.out.println("方法名=============="+joinPoint.getSignature().getName());
        System.out.println("类名=============="+joinPoint.getThis().getClass().getName());
        System.out.println("事务开始....");
        Object obj =joinPoint.proceed();
        System.out.println("事务提交");
    }
}
