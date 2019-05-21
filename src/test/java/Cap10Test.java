import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xxt.spring.cap10.aop.Calculator2;
import com.xxt.spring.cap10.config.Cap10MainConfig;

public class Cap10Test {
	
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
		
		
//		Calculator c = new Calculator();
		Calculator2 c = app.getBean(Calculator2.class);
		
		
		try {
			c.div2(4, 0);
		} catch (Exception e) {
			System.out.println("++++++ catch  +++++++++");
		}
		
		c.div(4, 2);
        String s = "sdfsdf sdfsdf ".replaceAll("asd", "asdasda");

        app.close();
        Integer integer = Integer.valueOf("21");
        long l = integer.longValue();

    }
	
}
