package com.tz.aop.aop01.springAop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 15:29 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 *  spring 注解Aop
 *
 *  在调用哪个方法时,会先到这个类里面来执行,这个类叫:切面类/也叫增强类/也叫织入类.
 *
 * <BR>
 */
@Aspect
@Component
public class TranscationAdvisor {

    //通知类+切面类,怎么去过来方法呢?
//	@Before:前置通知注解
//	@AfterReturning:后置通知
//	@AfterThrowing 异常通知
//	@Around：环绕型通知,execution within args target 等怎么去找到我"中意的方法"
    @Before("execution(* save*(..)) || execution(* update*(..))")
    public void beforeAdvisor(){
        System.out.println("===============事务提交了....");
    }
}
