package com.xxt.spring.cap6.config;

import com.xxt.spring.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class JamesFactoryBean implements FactoryBean<Monkey>{

	@Override
	public Monkey getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Monkey();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Monkey.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
}
