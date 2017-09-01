package com.tz.ioc.ioc02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/01/ 21:16 星期五<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>剧本 类
 *
 *  从这个类，开始看起走。
 * <BR>
 */
public class MogongMovie {

    /**
     * 拍电影名称：
     * MoGong
     * 角色：LiuDeHua -- Geli 刘德华 演的 隔离角色。
     * 剧本：攻城(方法)
     * 导演：Zhangyimou
     * <p>
     * <p>
     * <p>
     * 场景：刘德华 饰演 墨者 到达梁国场下。城上将军就问
     * 来者何人，刘德华回答道：墨者革离
     */


    // 回答
    public void cityGateAsk(Geli geli) {
        geli.responseAsk("墨者革离");
    }

}
