package constructor_Practice;

public class Student_2 {

  String StudentName;
  int StudentAge;
  double StudentMarks;
  
  
   void  takeinput(String l_StudentName, int l_StudentAge, double l_StudentMarks) {
	   
	   StudentName = l_StudentName;
	   StudentAge = l_StudentAge;
	   StudentMarks  = l_StudentMarks;
	   
   }
	   void  printdate() {
		   
		   System.out.println(StudentName);
		   System.out.println(StudentAge);
		   System.out.println(StudentMarks);
		   
	   }
	   
	   public static void main(String[] args) {
		   
		   Student_2 obj = new Student_2();
		   
		   obj.takeinput("Maruthi", 105 , 99.0);
		   
		   obj.printdate();
		   
	   }
}