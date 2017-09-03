package com.tz.aop.aop01.springAop.aopUpdate;

import java.sql.SQLException;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:23 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public class UserserviceImpl implements IUservice {
    @Override
    public void save(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id) throws SQLException {
        // 开户事务
        try {
            System.out.println("更新：" + id);
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 提交事务。
    }

    @Override
    public void delete(Integer id) {
        // 开户事务
        System.out.println("删除：" + id);
        // 提交事务。
    }

    @Override
    public void find() {
        System.out.println("查询。");
    }
}
