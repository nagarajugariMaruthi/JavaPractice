package person.copy;


public class Person {

	 String name;
	 int age;
	 
	 void display() {
		 System.out.println("Name : " + name);
		 System.out.println("age : " + age);
	 }
	 }

  public  class Student extends Person {
	 
	 int rollNO;
	 String Course;
	 
	 void DisplayStudent() {
		 
		 System.out.println("rollNo : " + rollNO);
		 System.out.println("Course : " + Course);
		 
	 }
}

