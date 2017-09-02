package com.tz.ioc.ioc04;
import java.io.IOException;

import com.tz.dao.UserDao;
import com.tz.ioc.ioc03.KeKe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 *
 * ResourceDemo
 * 创建人:xuchengfei
 * 时间：2015年10月13日-下午8:56:44
 * @version 1.0.0
 *
 */
public class ApplicationContextDemo {


	public static void main(String[] args) throws IOException {
        //ApplicationContext就立马初始化对象，注册Map中，但是它比我们BeanFacotory国际化，资源文件的加载，bean生命周期

		//第一种:通过类路径装载配置文件 ,Ant 风格URL  支持的。继承了的
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		// 加载多个。
//		new ClassPathXmlApplicationContext(new String[]{"classpath:bean.xml","classpath:bean2.xml","d://bean.xml"});
//		new ClassPathXmlApplicationContext("bean.xml");
		//第二种：通过磁盘路径装载配置文件
//		ApplicationContext context = new FileSystemXmlApplicationContext("file:/D:/tzprojects/tzspring02/src/bean.xml");



//		KeKe ke = (KeKe)context.getBean("keke");
//		ke.responseAsk("讲课");
		KeKe ke2 = context.getBean(KeKe.class);
		ke2.responseAsk("讲课");



		//第三种(容器加载)WebApplicationContext ,为容器服务,如:tomcat  servet(jsp) 的
        // 容器:存储一些作用域 一些数据,
        // 如:用户发起请求的一些东西,传输的一些东西
        // 容器 就是 初始化对象,找到对应的类,把类放置到对应位置去, 这个过程,是容器启动时,就完成了.





		//第四种(注释 加载) AnnotationConfigApplicationContext
//		ApplicationContext context2 = new AnnotationConfigApplicationContext("com.tz.ioc3");
//		UserDao userDao = (UserDao) context2.getBean("userDao");
//		userDao.saveUser();


//		ApplicationContext context3 = new AnnotationConfigApplicationContext(Beans.class);
//		Student student = context3.getBean(Student.class);
//		System.out.println(student.getUsername());



        //jdk---注解，泛型，枚举，增强foreach,动态参数
	}
}
