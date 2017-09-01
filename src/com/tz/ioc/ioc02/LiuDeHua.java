package com.tz.ioc.ioc02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/01/ 21:30 星期五<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>刘德华 类<BR>
 */
public class LiuDeHua extends Geli {
    public LiuDeHua(){}

    // 子类的构造函数，给，父类里面的构造函数赋值。
    public LiuDeHua(String name) {
        super(name);
    }


}
