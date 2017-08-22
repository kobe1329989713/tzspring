package com.tz.web;

import com.tz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/22/ 2:51 星期二<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Controller
@RequestMapping("/admin")
public class UserController {
//    @Autowired
//    private UserService userService;


    @ResponseBody
    @RequestMapping(value="/user")
    public String index() {
        System.out.println("======1");
        System.out.println("======1");
        System.out.println("======1");
        return "kobe";
    }
}
