package com.tz.ioc.ioc02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/01/ 21:55 星期五<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class Keke extends Geli {
    // 子类的构造函数，给，父类里面的构造函数赋值。
    public Keke(String actorName) {
        super(actorName);
    }

    public Keke() {
    }
}
