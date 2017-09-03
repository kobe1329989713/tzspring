package com.tz.ioc.ioc04;

import com.tz.ioc.ioc03.LiuDeHua;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/02/ 13:39 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>
 *
 *  找配置文件,如何找 通过 io 来找配置文件.因为它也是一个文件了
 *  就是通过,你扫包 的哪个配置,它就是扫包里面的找.xml 文件的
 *
 *
 *  接口 可惜继承 接口
 *  看接口,看下标准就好(就是主要看接口里面方法名的意思,就能体会它是什么标准了), 重点是看它的各个个实现类,是如何实现这个标准的.
 *
 *
 *  多态在 new 时,可以直接 new 它的 孙子类
 * <BR>
 */
public class ResourceDemo {
    public static void main(String[] args) throws IOException {
//          配置文件几种找法,多态,个个子类的不同找法.
//        Resource resource = new ClassPathResource("/applicationContext.xml");
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        // 2
//        resource = new FileSystemResource("d:/tzspring02/src/bean.xml");







        /*spring容器加载资源文件的核心类(配置文件) PathMatchingResourcePatternResolver
        *
        *   不用你去选择用哪个子类来加载配置文件了,统一用一个类来加载,不管你写什么它都加载到,它就是根据前面你加的哪个前缀来确定你到低在哪个里面去找配置文件,
        *   它就是根据 前缀来找.
        * */
		ResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
		                                                    // 还有正则配置的哪个找.
		Resource resource = resourceLoader.getResource("classpath:bean.xml");//ClassPathResource
//		Resource resource2 = resourceLoader.getResource("file:applicationContext.xml");
        // 就找到配置文件了.
//		System.out.println(resource.getDescription()+"===="+resource.getFile().getAbsolutePath());
        /**
         *  还有正则配置的哪个找. Ant风格 的匹配
         *
         *      classpath:/ 和 classpath  等价
         *      classpath*:bean.xml   找到所有 xxxbean.xml 所有配置文件 ,多个了,所以返回的是数组
         *      ? 匹配文件名贵一个字符
         *      * 匹配文件名中任意个字符
         *      ** 匹配多层路径
         */
//		Resource[] resource2 = resourceLoader.getResources("classpath:com/tz/**/application*.xml");//ClassPathResource
//        for (Resource resource1 : resource2) {
//            System.out.println(resource1.getDescription()+"===="+resource1.getFile().getAbsolutePath());
//        }








//        springAop 最终目录的，就是找到我需要的哪个对象。
        // BeanFactory ,还有很多功能。
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        // 它获取时，就是把.xml 里面配置的哪些 装配到一个 map 里面，然后 通过 key 来获取到。 ？？注解方式。
        LiuDeHua object =  (LiuDeHua)xmlBeanFactory.getBean("liuDeHua");
//		LiuDeHua object2 =  (LiuDeHua)xmlBeanFactory.getBean("liudehua");
		object.responseAsk("讲课");
//
//		System.out.println(object);
//		System.out.println(object2);
//
        // 获得Bean定义名称
		String[] names = xmlBeanFactory.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("==========="+string);
			System.out.println(xmlBeanFactory.getBean(string));
		}




        //BeanFactory:并不是立马初始化对象，而是在调用getBean的时候初始化对象
        //ApplicationContext就立马初始化对象，注册Map中，但是它比我们BeanFacotory国际化，资源文件的加载，bean生命周期



        // 三个子类，如下： ApplicationContext 它是 BeanFactor 的一个子类  ，开发时都是用它 ApplicationContext 了。
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
//      ClassPathXmlApplicationContext  从 classpath 目录加载配置文件。
//		WebApplicationContext  从 容器里面加载加载配置文件。
//		FileSystemXmlApplicationContext   从 硬盘加载加载配置文件。
        // 它还是一样的，找到配置文件，然后 解析 加载 然后通过 key 来获取到我需要 的对象。


        /**
         * springAop 框架，找到配置文件，解析 配置文件、这些基本，只要你javaSe 功能低好，都不算太难
         *
         * 最难的是：每一个对象的监听和生命周期 Aop，这些都是最难的，它会用到多线程了。
         *
         *
         *
         */

    }
}
