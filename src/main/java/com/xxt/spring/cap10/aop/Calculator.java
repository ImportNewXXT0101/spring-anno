package com.xxt.spring.cap10.aop;

public class Calculator {
	//业务逻辑方法
	public int div(int i, int j){
		System.out.println("-------- i/j ");
		return i/j;
	}
	
	//业务逻辑方法
	public int div2(int i, int j){
		System.out.println("-------- i/j(2) ");
		return i/j;
	}
	
}
