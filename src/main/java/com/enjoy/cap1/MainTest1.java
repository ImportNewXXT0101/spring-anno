package com.enjoy.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enjoy.cap1.entity.Dog;

public class MainTest1 { 
	public static void main(String args[]){
		//把beans.xml的类加载到容器
		ApplicationContext app = 
				new ClassPathXmlApplicationContext("beans.xml");
		//从容器中获取bean
		Dog aDog = (Dog) app.getBean("dog");
		
		
		System.out.println(aDog);
	}
}
