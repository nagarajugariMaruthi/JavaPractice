package demoProject;

    
	import java.util.*;
	import java.util.stream.Collectors;

	public class Example_1 {

	    public static void main(String[] args) {

	        List<Employee> employees = Arrays.asList(
	                new Employee("Maruthi", "IT", 50000),
	                new Employee("Dhanvitha", "HR", 30000),
	                new Employee("Vamshi", "IT", 50000),
	                new Employee("Sunil", "Finance", 60000),
	                new Employee("Nagaraju", "IT", 30000)
	        );

	        Map<Double, List<Employee>> result = employees.stream()
	                .collect(Collectors.groupingBy(Employee::getSalary));

	        result.forEach((salary, employeeList) -> {
	            if (employeeList.size() > 1) {
	                System.out.println(salary + " : " + employeeList);
	            }
	        });
	    }
	}

	class Employee {

	    private String name;
	    private String department;
	    private double salary;

	    public Employee(String name, String department, double salary) {
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	}