package inheritanceProject;

	public class Teacher extends Person3 {

	    int employeeId;
	    String subject;

	    void displayTeacher() {
	        System.out.println("Employee ID : " + employeeId);
	        System.out.println("Subject : " + subject);
	    }
	}