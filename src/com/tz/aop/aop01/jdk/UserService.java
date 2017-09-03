package com.tz.aop.aop01.jdk;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 12:23 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class UserService implements IUserService {

    @Override
    public void buy(String name) {
        // 付钱 aop
        System.out.println(name + "：买好洗衣粉，回家洗衣");
        // 登录账目
    }
}
