package com.tz.aop.aop01.springAop.aopUpdate;

import java.sql.SQLException;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/03/ 14:21 星期日<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
public interface IUservice {
    public void save(String name);

    public void update(Integer id) throws SQLException;

    public void delete(Integer id);

    public void find();
}
