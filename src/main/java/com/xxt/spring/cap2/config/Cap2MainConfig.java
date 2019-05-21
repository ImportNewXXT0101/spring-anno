package com.xxt.spring.cap2.config;

import com.xxt.spring.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@Controller  @Service  @Respostry  @Component
@ComponentScan(value="com.enjoy.cap2", excludeFilters={		
		@Filter(type=FilterType.CUSTOM, classes={JamesTypeFilter.class})		
}, useDefaultFilters=true)


public class Cap2MainConfig {
	//给容器中注册一个bean, 类型为返回值的类型, 
	@Bean
	public Person person01(){
		return new Person("james",20);
	}
}
