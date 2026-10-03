package encapsulation;

public class Employee {

  private String setEmpName;
	private double setSalary;
	
	public void setName(String name) {
	    this.setEmpName = name;
	}

	public void setSalary(double salary) {
	    this.setSalary = salary;
	}

	public String getName() {
	    return setEmpName;
	}

	public double getSalary() {
	    return setSalary;
	}
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.setName("1001");
		obj.setSalary(50000);
		
		System.out.println("StudentID: " + obj.setEmpName);
		System.out.println("StudentSalary : " + obj.setSalary);
	}
}