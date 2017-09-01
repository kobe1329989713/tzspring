package com.tz.ioc.ioc01;

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
    public void cityGateAsk() {
        // 刘德华不能饰演，就可以换一个
//        Geli liuDeHua = new LiuDeHua("kobe");
        Geli liuDeHua = new Keke("Keke");
        liuDeHua.responseAsk("墨者革离");
        // 重点就是 子类的构造，给父类的构造赋值。
    }
    /**
     * 应用场景：就是解偶，可以切换来。解偶必须多态。
     */



    /**
     * 问题：
     *  1、这个角色必须 要用刘德华来饰演，就有偶合了。
     */
    public static void main(String[] args) {
        // 如果刘德华不能来饰演了，这里程序，就会出现问题。
        // cityxx 哪里用多态，就算刘德华不能饰演了，还可以指定其它子类来饰演。
        MogongMovie mogongMovie = new MogongMovie(); // 这里还是偶合的，如何解偶了？
        mogongMovie.cityGateAsk();
    }
}
