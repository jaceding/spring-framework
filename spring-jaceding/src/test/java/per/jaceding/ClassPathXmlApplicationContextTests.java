package per.jaceding;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于XML的IOC容器的初始化
 *
 * @author jaceding
 * @date 2021/8/29
 */
public class ClassPathXmlApplicationContextTests {

	@Test
	public void testFooService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classPathXmlApplicationContextTests.xml");
		UserComponent userComponent = context.getBean("userComponent", UserComponent.class);
		System.out.println(userComponent.getClass().getName());
	}
}
