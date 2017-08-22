package com.tz.service;

import com.tz.dao.UserDao;
import com.tz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/22/ 2:49 星期二<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findUsers() {
        return userDao.findUser();
    }
}
