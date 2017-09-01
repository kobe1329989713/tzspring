package com.tz.ioc.ioc03;

/**
 * 剧本 类
 *
 */
public class MoGongMovie {

	private GeLi geLi;

	public MoGongMovie(){

	}
	public MoGongMovie(GeLi geLi){
		this.geLi = geLi;
	}



	/**
	 * 开始 拍
	 */
	public void startMovie(){
		//选择一个演员
		geLi.responseAsk("墨者隔离");
	}


	public void setGeLi(GeLi geLi) {
		this.geLi = geLi;
	}

}
