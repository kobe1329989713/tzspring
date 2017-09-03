package com.tz.ioc.ioc05;

import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 16:13 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Component // 代表这个类需要 被spring 管理,  加了spring任意注解,就代表它被 springAop 所管理起来了. 就是被 application 所管理起来,前提必须要找到我,而已找到我就是要 扫包
public class UserDao {

    public void svae() {
        System.out.println("svae method");
    }
}
