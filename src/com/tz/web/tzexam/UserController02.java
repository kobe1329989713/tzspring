package com.tz.web.tzexam;

import com.tz.dao.tzexam.UserDao2;
import com.tz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 17:28 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Controller
@RequestMapping("/tzexam")
public class UserController02 {


    @Autowired
    private UserDao2 userDao2;


    @RequestMapping("/index")
    public String index() {
        User user = new User();
        user.setEmail("22@.qcom");
        userDao2.save(user);
        return "index";
    }
    // 根据 javaBean 生成 表，没有完成。
}
