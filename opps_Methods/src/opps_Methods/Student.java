package opps_Methods;

public class Student {

 int StudentId;
 String StudentName;
 double StudentMarks;
 
 Student() {
	 
	 StudentId = 101;
	 StudentName = "Maruthi";
	 StudentMarks = 99;
 }
	 
 void printdate() {
	 
	 System.out.println("Studnt Id : " + 101);
	 System.out.println("Student Name : " + "Maruthi");
	 System.out.println("Student Marks : + " + 99);
	 
 }
 
 public static void main(String[] args) {
	 
	 Student stu1 = new Student();
	 
	 stu1.printdate();
 }
}