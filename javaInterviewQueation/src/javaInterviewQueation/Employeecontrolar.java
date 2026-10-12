package javaInterviewQueation;

public class Employeecontrolar { 

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class EmployeeController {

	    private final EmployeeService employeeService;

	    // Constructor Injection
	    public EmployeeController(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    @GetMapping("/employee")
	    public String getEmployeeMessage() {
	        return employeeService.getMessage();
	    }
	}

}
