package construcoter_referance;
 
import java.util.function.Supplier;

//  1. Create an object using Constructor Reference.

class Student {
  int id;
  String name;
  
  Student() {
	  
	  this.id = 105;
	  this.name = "Maruthi";
  }
	  void  display() {
		  
		  System.out.println("id = " + id);
		  System.out.println("name = " + name);
	  }
  }

public class Example_1 {
	
	public static void main(String[] args) {
		
		Supplier<Student> Supplier =  Student::new;
		
		Student student = Supplier.get();
		
	 student.display();
	}
}