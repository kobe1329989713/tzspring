package com.tz.web;

import com.tz.model.User;
import com.tz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    @Autowired
    private UserService userService;

    // fastjson


//    @ResponseBody
    @RequestMapping("/user")
    public ModelAndView index() {
        ModelAndView m = new ModelAndView();
        List<User> us = userService.findUsers();
        m.addObject("users", us);
        m.setViewName("index");
        return m;
    }

    // /admin/user/save
    @RequestMapping("/user/save")
	public ModelAndView usersave(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setAddress(request.getParameter("address"));
		user.setEmail(request.getParameter("email"));
		boolean flag = userService.save(user);
		if(flag){
			modelAndView.setViewName("success");
		}else{
			modelAndView.setViewName("fail");
		}
		return modelAndView;
	}


}
