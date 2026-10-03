package inheritance.copy;

 public class Person {

  String StudentName;
  int StudentAge;
  
  public void DisplayPerson() {
	  
	  System.out.println("Student Name : " + StudentName);
	  System.out.println("Student Age : " + StudentAge);
  }  
  
  }

  
  class Student extends Person {
	  
	  int RollNo;
	  String Course;
	  
	  void display() {
		  
		  System.out.println("Student RollNo : " + RollNo);
		  System.out.println("Student Course : " + Course);
		  
	  }
  }
  
   class PersonMain {
  
  public static void main(String[] args) {
	  
	  Student obj = new Student(); 
		  
		  obj.StudentName = "Maruthi";
		  obj.StudentAge = 27;
		  obj.RollNo = 102;
		  obj.Course = "MCA";
		  
		  obj.DisplayPerson();
		  obj.display();
		  
	  }
  }
	 	  
