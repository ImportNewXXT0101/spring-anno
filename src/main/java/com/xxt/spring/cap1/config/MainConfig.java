package com.xxt.spring.cap1.config;

import com.xxt.spring.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类====配置文件
@Configuration
public class MainConfig {
	//给容器中注册一个bean, 类型为返回值的类型, 
	@Bean("a")
	public Person person01(){
		return new Person("james",20);
	}
}
