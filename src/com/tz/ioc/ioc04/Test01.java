package com.tz.ioc.ioc04;

import com.tz.ioc.ioc03.MoGongMovie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 12:33 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>获取配置文件里面，哪些装配好了的类<BR>
 */
public class Test01 {
    public static void main(String[] args) {
        //加载到了资源文件,必须在 classpath 目录里面才能获取.
        Resource resource = new ClassPathResource("applicationContext.xml");
//        通过 盘符获取
        //Resource resource = new FileSystemResource("D:/tzprojects/tzspring02/src/bean.xml");
        // ServitContextResource 通过容器获取配置文件,如 web.xml 容器. 所以你必须要在web.xml 里面去配置下,这个一般不能你去管.只要你配置了.springAop 会自己去获取的.
        // 所以你tomcat 一启动它就可以获取spring 容器里面的数据了,所以你就可以用注释了.

        // 所以你想换演员时,只需修改配置文件即可.而已不用去修改代码了.就是从.xml文件里面获取
        // 数据,


        //初始化工程
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        // 获取。
        MoGongMovie movie = (MoGongMovie) beanFactory.getBean("movie");
        // 调用方法开始拍电影。
        movie.startMovie();


        // 配置到哪个配置文件里面过都是单例的。
        MoGongMovie movie2 = (MoGongMovie) beanFactory.getBean("movie");
        System.out.println(movie);
        System.out.println(movie2);
    }
}
