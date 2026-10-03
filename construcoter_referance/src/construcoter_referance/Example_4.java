package construcoter_referance;

import java.util.function.Function;

 class Employee {
	 
	  String name;
	  
	   Employee(String name) {
		   this.name = name;
		   System.out.println("name" + name);
		   
	   }
 }

public class Example_4 {
	
	public static void main(String[] args) {
		
		Function<String, Employee> f = Employee::new;
		
		Employee employee = f.apply("Maruthi");
		
		  
	}

}
