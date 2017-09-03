package com.tz.aop.aop01.springAop.before;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 13:41 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class WaiterImpl implements IWaiter {
    @Override
    public void sayHello(String name) {
        System.out.println("你好!"+name);
    }

    @Override
    public void server(String name) {
        System.out.println("服务于："+name);
    }
}
