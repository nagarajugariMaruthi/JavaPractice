package javaInterviewQueation;

  public class EmployeeService {

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;

	@Component
	public class EmployeeService {

	    private final Employee employee;

	    @Autowired
	    public EmployeeService(Employee employee) {
	        this.employee = employee;
	    }

	    public void showEmployee() {
	        employee.displayName();
	    }
	}