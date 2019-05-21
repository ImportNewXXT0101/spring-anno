import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xxt.spring.cap1.util.PU;
import com.xxt.spring.cap6.config.Cap6MainConfig;

public class Cap6Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(Cap6MainConfig.class);
		
		System.out.println("IOC容器创建完成........");
		
		
		Object bean1 = app.getBean("jamesFactoryBean");
		Object bean2 = app.getBean("jamesFactoryBean");//取Money
		PU.print("bean的类型="+bean1.getClass());
		PU.print(bean1 == bean2);
		
		

		Object bean3 = app.getBean("&jamesFactoryBean");//取Money
		PU.print(bean3);
		
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println("--> "+name);
		}
		
		
		
		
		
	}
}
