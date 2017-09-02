package com.tz.dao.tzexam;

import com.tz.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 18:20 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Repository
public class UserDao2 extends BaseDao {

    @Transactional
    public void save(User user) {
        getSession().save(user);
    }
}
