package coursetodo;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CourseSpringImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx;
		//String configFile = "spring-config.xml";
		//ctx = new ClassPathXmlApplicationContext(configFile);
		String filePath="./src/spring-config.xml";
		ctx=new FileSystemXmlApplicationContext(filePath);
		/*
		Object obj = ctx.getBean("myCourse");
		System.out.println(obj);
		*/
		/*
		Object obj = ctx.getBean("myCourse2");
		System.out.println(obj);
		*/
		Object obj = ctx.getBean("myCourse3");
		System.out.println(obj);
	}
}


