
package com.tz.aop.aop01.springAop.annotation02.impl;

import com.tz.aop.aop01.springAop.annotation02.in.IPerson;
import org.springframework.stereotype.Component;


@Component
public class XiaoTianImpl implements IPerson {

	@Override
	public void addPerson() {
		System.out.println("添加小天");
	}

	@Override
	public void addPersonNum(int num, int age) {
		System.out.println("添加天天数量");
	}

	@Override
	public void updatePerson(String name, boolean flag) {
		System.out.println("更新天天");
	}

	@Override
	public void del() {
		System.out.println("=====delate====");
		// TODO Auto-generated method stub

	}



}

