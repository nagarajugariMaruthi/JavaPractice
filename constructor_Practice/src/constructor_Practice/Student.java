package constructor_Practice;

public class Student {

	int age;
 String name;

    Student() {
    	this("Maruthi", 25);
    	System.out.println("Paramterize Constructer");
    }
    
   Student(String name, int age) {
	   this.name = name;
	   this.age = age;
	   
	   System.out.println("Student Name : " + name);
	   System.out.println("Student Age : " + age);
	   System.out.println("Default Constructer ");
	   
   }
   
   public static void main(String[] agrs) {
	   
	   Student obj = new Student();
	   
   }
}
  