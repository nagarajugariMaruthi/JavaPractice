package opps_Methods;

public class Student_1 {

  String StudentName;
  int StudentId;
  double StudentMarks;
  
   Student_1() {
	   
	   StudentName = "Maruthi";
	   StudentId = 105;
	   StudentMarks = 99;
	   
   }
   
   Student_1(int StudentId, String StudentName, double StudentMarks) {
	   
	   this.StudentName = StudentName;
	   this.StudentId = StudentId;
	   this.StudentMarks = StudentMarks;
   }
   
   void printdate() {
	   
	   System.out.println("StudentName : " + StudentName);
	   System.out.println("StudentId : " + StudentId);
	   System.out.println("StudentMarks : " + StudentMarks);
	   
	   System.out.println("---------------------------------");
   }
   
   public static void main(String[] args) {
	   
	   Student_1 stu1 = new Student_1();
	   
	   Student_1 stu2 = new Student_1(102,"Dhanvitha" , 87);
	   
	   stu1.printdate();
	   stu2.printdate();
   }
}
	   