package com.tz.aop.aop01.jdk;

import java.lang.reflect.Proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 12:33 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestAop {
    public static void main(String[] args) {

        // 1 调用这个方法，前后要增加。
        IUserService userService = new UserService();

        // 2 把1 传递进去增加。
        WavingInvocationHandler handler = new WavingInvocationHandler(userService);

        // 3 代理类--增强的对象，重点。
        IUserService proxy = (IUserService)Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
        userService.getClass().getInterfaces(),handler);

        // 调用一。
        proxy.buy("kobe");
        System.out.println("===================");
        // 调用二。
        String name = "Array";
        proxy.buy(name);
        System.out.println("======// 调用三。=============");
        proxy.buy("水");
    }
    // springAop Aop 就是把这些配置，配置文件当中。

}
