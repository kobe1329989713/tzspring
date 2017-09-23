
package com.tz.aop.aop01.springAop.annotation02.in;

import org.springframework.stereotype.Component;


public interface IPerson {
	public void addPerson();
	public void addPersonNum(int num, int age);
	public void updatePerson(String name, boolean flag);
	public void del();
}

