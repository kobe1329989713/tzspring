package com.tz.aop.aop01.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 13:26 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 * CGLib才用底层字节码技术，可以为一个类创建子类，并子类中采用方法拦截技术
 * "拦截"所以父类方法的调用，并且顺势"织入"我们需要的业务"逻辑代码".
 *
 * 简语”当一个类继承了cgblib类以后，实现类MethodInterceptor,
 * 在目标对象对象方法的时候就是进行拦截，并且织入逻辑代码
 *
 *
 *
 * <BR>
 */
public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clz) {
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] params, MethodProxy proxy) throws Throwable {

        System.out.println("// 付钱");
        Object result = proxy.invokeSuper(obj, params);
        System.out.println("// 登录账目");

        return result;
    }
}
