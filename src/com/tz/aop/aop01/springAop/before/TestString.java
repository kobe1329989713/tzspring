package com.tz.aop.aop01.springAop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 13:49 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 *  SpringAop:的底层就是通过JDK动态代理"或"CGLib动态代理为技术目标织入横切逻辑。
 *
 *  org.springframework.aop.BeforeAdvice 前置通知:在目标方法之前，执行的业务逻辑 :MethodBeforeAdvice
 *  org.springframework.aop.AfterReturningAdvice 后置通知:在目标方法之后，执行的业务逻辑
 *  org.aopalliance.intercept.MethodInterceptor 环绕通知:目标方法执行前后，执行的业务逻辑(用的最多的)
 *  org.springframework.aop.ThrowsAdvice 异常通知：执行目标方法出现异常，执行的业务逻辑（几乎很少使用）
 *  org.springframework.aop.IntroductionInterceptor 引介通知.在目标类中添加了一些新的方法和属性的时候，执行的业务逻辑（几乎很少使用）

 * 采用spring的jdk动态代理
 * 1：接口
 * 2:织入类（通知类）
 * 3:目标类
 * 4:代理类
 *
 *
 *
 * <BR>
 */
public class TestString {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/tz/aop/aop01/springAop/before/beanAop_01.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        WaiterImpl waiterImpl = (WaiterImpl) context.getBean("proxy");
        waiterImpl.sayHello("kobe");
        System.out.println("====================");
        waiterImpl.server("keke");
    }
}
