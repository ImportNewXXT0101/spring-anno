import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap2.config.Cap2MainConfig;
import com.enjoy.cap3.config.Cap3MainConfig;

public class Cap3Test {
	@Test
	public void test01(){
		System.out.println("before");
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
		System.out.println("after");
		
		
		String[] names = app.getBeanDefinitionNames();
		
		for(String name:names){
			if (name.length()<20) {
				System.out.println("---------------");
				System.out.println(name);
			}
		}
		System.out.println("---------------");
		//从容器中分别取两次person实例, 看是否为同一个bean
		System.out.println("use person1");
		Object bean1 = app.getBean("person");
		System.out.println("use person2");
		Object bean2 = app.getBean("person");
		System.out.println(bean1 == bean2);
		//结论:默认情况 bean1就是bean2,同一个对象
		
	}
}
