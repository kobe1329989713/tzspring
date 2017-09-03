package com.tz.aop.aop01.springAop.annotation;

import org.springframework.stereotype.Component;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 15:26 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Component
public class UesrServiceImpl {
    public void saveUser() {
        System.out.println("=====saveUser====");
    }
    public void updateUser() {
        System.out.println("=====updateUser====");
    }
    public void findUser() {
        System.out.println("=====findUser====");
    }
}
