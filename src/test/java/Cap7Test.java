import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xxt.spring.cap7.config.Cap7MainConfigOfLifeCycle;

public class Cap7Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
		System.out.println("----------");
		app.close();
		System.out.println("----------");
		
	}
}
