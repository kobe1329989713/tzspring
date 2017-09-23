
package com.tz.aop.aop01.springAop.annotation02.child;

import org.springframework.stereotype.Component;


@Component
public class TanshouImpl{

	public void addPerson() {
		System.out.println("添加11111111111111111111");
	}

	public void addPersonNum(int num, int age) {
		System.out.println("添加11111111111111111111量");
	}

	public void updatePerson(String name, boolean flag) {
		System.out.println("更新11111111111111111111");
	}


	public void del() {
		System.out.println("oooooooooooooooooooooooooox11111111111111111111");
	}


}

