package com.tz.ioc.ioc02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/01/ 22:04 星期五<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>导演 类，
 *
 *
 *      从这个类开始看。
 * <BR>
 */
public class Decorator {
    public void decoratorMovie() {
//        System.out.println("我要拍摄墨风电影。");


        // 导演就开始调配，哪个角色由哪个演员来饰演。


        // 重点。子构造给父构造赋值。
        // 把演员选好。
        Geli geli = new LiuDeHua("刘德华"); // 抱角色了？？
        // 把剧本选择好。
        MogongMovie mogongMovie = new MogongMovie();
        mogongMovie.cityGateAsk(geli);
    }

    public static void main(String[] args) {
        new Decorator().decoratorMovie();
    }

    /**
     * 父类里面封装好了的方法，参数是 子类传递进去的，
     * 所以 数据在变，执行的结果也是在变的。
     */
}
