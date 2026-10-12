package javaInterviewQueation;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	public class MainApp {
	@Configuration
	@ComponentScan("demoProject")
	public class MainApp {

	    public static void main(String[] args) {

	        AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(MainApp.class);

	        EmployeeService service =
	                context.getBean(EmployeeService.class);

	        service.showEmployee();

	        context.close();
	    }
	}
