package com.tz.ioc.ioc01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/01/ 21:42 星期五<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>角色 类<BR>
 */
public class Geli {
    private String actorName;

    public Geli(String actorName) {
        this.actorName = actorName;
    }

    public Geli() {
    }

    public void responseAsk(String message) {
        System.out.println(actorName + "===" + message);
    }

}
