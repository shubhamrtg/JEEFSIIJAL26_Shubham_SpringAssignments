import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientA {

	static ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);
	//static ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
	
		System.out.println("main starts");
		CarService ser=ctx.getBean("car1",CarService.class);
		ser.drive();
		CarService ser2=ctx.getBean("car2",CarService.class);
		ser2.drive();
	}

}
