package method_Basic_Practice;

public class Student {
	
	int id;
	String name;
	
	  public static void main(String[] args) {

		  // creating new student object new keyword
		  Student s1 = new Student();   
		  
		  // assigen value 
		  
		   s1.id = 102;
		   s1.name = "Maruthi";
		   
		   // printing value 
		   
		   System.out.println("Student ID = " + s1.id);
		   System.out.println("Student Name = " + s1.name);
	  }
}

