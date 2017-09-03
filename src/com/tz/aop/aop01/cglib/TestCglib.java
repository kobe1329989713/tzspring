package com.tz.aop.aop01.cglib;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 13:32 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class TestCglib {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        UserService userService = (UserService) proxy.getProxy(UserService.class);
        userService.buy("kobe");
    }
}
