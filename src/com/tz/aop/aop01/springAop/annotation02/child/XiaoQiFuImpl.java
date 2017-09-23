
package com.tz.aop.aop01.springAop.annotation02.child;

import com.tz.aop.aop01.springAop.annotation02.in.IPerson;
import org.springframework.stereotype.Component;


@Component
public class XiaoQiFuImpl implements IPerson {

	@Override
	public void addPerson() {
		System.out.println("添加祈福");
	}


	@Override
	public void addPersonNum(int num, int age) {
		System.out.println("添加祈福数量");
	}

	@Override
	public void updatePerson(String name, boolean flag) {
		System.out.println("更新祈福");
	}


	@Override
	public void del() {

		System.out.println("ooooooooooooooooooooooooooxaiqifu");
	}

}

