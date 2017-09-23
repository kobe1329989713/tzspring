
package com.tz.aop.aop01.springAop.annotation02.impl;


import com.tz.aop.aop01.springAop.annotation02.in.IPerson;
import org.springframework.stereotype.Component;

@Component
public class FeiFeiImpl implements IPerson {

	@Override
	public void addPerson() {
		System.out.println("添加菲菲");
	}

	public void addPerson2() {
		System.out.println("添加菲菲2222222222222222222222222");
	}

	@Override
	public void addPersonNum(int num, int age) {
		System.out.println("添加菲菲数量");
	}

	@Override
	public void updatePerson(String name, boolean flag) {
		System.out.println("更新菲菲");
	}

	@Override
	public void del() {

		// TODO Auto-generated method stub

	}

}

