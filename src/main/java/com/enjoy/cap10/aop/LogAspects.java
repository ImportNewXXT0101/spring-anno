package com.enjoy.cap10.aop;

import java.util.Arrays;
import java.util.Iterator;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

//日志切面类
@Aspect
public class LogAspects {
	
	private int i = 0;
	
	@Pointcut(
			"execution"
			+ "(public int "
			+ "com.enjoy.cap10.aop.Calculator2.*(..))")
	public void pointCut(){};
	
	//@before代表在目标方法执行前切入, 并指定在哪个方法前切入
	@Before(value="pointCut()")
	public void logStart(JoinPoint jPoint) throws Exception{
		Object[] argsObjects = jPoint.getArgs();
		System.out.println(jPoint.getSignature().getName()+ 
				"  除法运行....参数列表是: --> "+Arrays.asList(argsObjects));
		if (argsObjects[1].equals(0)) {
			throw new Exception("udf == exception");
		}
		
	}
	@After("pointCut()")
	public void logEnd(){
		System.out.println("除法结束......");
		
	}
	@AfterReturning(value="pointCut()",returning="result")
	public void logReturn(Object result ){
		System.out.println("除法正常返回......运行结果是: "+result);
	}
	@AfterThrowing(value="pointCut()",throwing="exception")
	public void logException(Exception exception){
		System.out.println("运行异常......异常信息是:  " + (++i) +" " + exception);
	}
	
	@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("@Around:执行目标方法之前...");
		Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
		System.out.println("@Around:执行目标方法之后...");
		return obj;
	}
}
