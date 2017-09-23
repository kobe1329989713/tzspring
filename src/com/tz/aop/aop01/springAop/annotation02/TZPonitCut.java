
package com.tz.aop.aop01.springAop.annotation02;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class TZPonitCut {
	
	@Pointcut("execution(* *(..))")
	public void filterSaveMethod(){}
	
}

