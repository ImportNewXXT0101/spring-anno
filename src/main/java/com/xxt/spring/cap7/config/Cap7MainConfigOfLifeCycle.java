package com.xxt.spring.cap7.config;

import com.xxt.spring.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.enjoy.cap7.bean")
@Configuration
public class Cap7MainConfigOfLifeCycle {
	
	
//	@Bean("person")
//	public Person person(){
//		return new Person("person",20);
//	}
	@Bean(initMethod="init1", destroyMethod="destory")
	public Bike bike(){
		return new Bike();
	}
	
}
