package com.tz.aop.aop01.springAop.annotation02;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 16:01 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
//@Aspect
//@Component
public class BeforePersonAdvisor {

    //	@Before:前置通知注解
    //	@AfterReturning:后置通知
    //	@AfterThrowing 异常通知
    //	@Around：环绕型通知,execution within args target 等怎么去找到我"中意的方法"

//    @Before("execution(public void addPerson())") // 指定给某一个方法加 aop
    public void beforeAdvice() {
        System.out.println("早上好");
    }
}
