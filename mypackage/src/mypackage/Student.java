package mypackage;

public class Student {

 String name;
 int age; 
 
   public Student(String name , int age) {
	   
	   this.name = name;
	   this.age = age;
   }
   
   public void displayStudent() {
	   
	   System.out.println("Student name : " + name );
	   System.out.println("Student Age  : " + age );
   }
   }