/**
 * tzdeskϵͳƽ̨
 * tzspring02
 * com.tz.ioc
 * Director.java
 * ������:xuchengfei 
 * ʱ�䣺2015��10��10��-����9:19:40 
 * 2015̶�ݽ�����˾-��Ȩ����
 */
package com.tz.ioc.ioc03;

/**
 *
 * 导演类
 *
 */
public class Director {


	/**
	 * 开始 拍电影
 	 */
	public void director(){
		//选角色
		GeLi geLi = new KeKe("keke");
		//给剧本分配角色
		MoGongMovie moGongMovie = new MoGongMovie(geLi);  // 通过构造赋值。 就是把具体的是哪个子类(哪个角色)传递进去。
//		moGongMovie.setGeLi(geLi);  // 通过 setXxx() 赋值。      一样。
		//开始对台本
		moGongMovie.startMovie();
	}
}
