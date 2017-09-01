package com.tz.ioc.ioc03;

/**
 *	角色 类
 *
 */
public class GeLi {


	private String name;

	public GeLi(){

	}

	public GeLi(String name){
		this.name = name;
	}

	/**
	 *	谁 回答
	 */
	public void responseAsk(String message){
		System.out.println(this.name+"===="+message);
	}
}
