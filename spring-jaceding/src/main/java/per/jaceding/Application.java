package per.jaceding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author jaceding
 * @date 2021/8/7
 */
@ComponentScan("per.jaceding")
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		UserComponent userComponent = context.getBean(UserComponent.class);
		System.out.println(userComponent.getClass());
	}

	@Component
	public static class UserComponent {
	}
}
