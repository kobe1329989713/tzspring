
package com.tz.aop.aop01.springAop.annotation02.impl;

import com.tz.aop.aop01.springAop.annotation02.in.IPerson;
import org.springframework.stereotype.Component;


@Component
public class XiaoxueImpl implements IPerson {

	@Override
	public void addPerson() {
		System.out.println("添加小雪");
	}

	@Override
	public void addPersonNum(int num, int age) {
		System.out.println("添加小雪数量");
	}

	@Override
	public void updatePerson(String name, boolean flag) {
		System.out.println("更新小雪");
	}

	@Override
	public void del() {

		// TODO Auto-generated method stub

	}

}

