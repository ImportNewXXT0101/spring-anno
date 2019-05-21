package com.xxt.spring.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xxt.spring.cap1.config.MainConfig;
import com.xxt.spring.cap1.util.PU;

public class MainTest2 { 
	public static void main(String args[]){
		
		ApplicationContext app =
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		Object object = app.getBean("a");
		
		PU.print(object);
		
		String[] namesForBean = app.getBeanNamesForType(Person.class);
		for(String name:namesForBean){
			PU.print(name);
		}
		
		
		
		
	}
}
