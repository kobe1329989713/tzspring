package com.tz.aop.aop01.springAop.annotation02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 16:20 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
//@Aspect
//@Component
public class AfterPersonAdvisor {
//    @AfterReturning("(execution(* com.tz.aop6..*.add*(..)) or execution(* com.tz.aop6..*.update*(..))) and args(..)")
    @AfterReturning("execution(* com.tz.aop.aop01.springAop..*.add*(..))")
    public void afterAdvisor() {
        System.out.println("下午好");
    }
}
