package basic_String_question;

public class StudentClass {
  
	String EmpName;
	int EmpStudentID;
	double EmpMarks;
	
	void takeinput(String l_EmpName, int l_EmpStudentID, double l_EmpMarks) {
		
		EmpName = l_EmpName;
		EmpStudentID = l_EmpStudentID;
		EmpMarks = l_EmpMarks;
		
	}
	
	void printdate() {
		
		System.out.println("Student Name: " + EmpName);
		System.out.println(" Student ID : " + EmpStudentID);
		System.out.println(" StudentMarks : " + EmpMarks);
	}
	
	public static void main(String[] args) {
		
		StudentClass Emp1 = new StudentClass();
		Emp1.takeinput("Maruthi" , 102, 99.0);
		Emp1.printdate();
	}
}