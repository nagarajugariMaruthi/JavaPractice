package java8Conceptsquestion;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class EmployeFelter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> Employees = Arrays.asList(
		new Employee (102, "Maruthi", 50000),
		new Employee (103, "dhanvitha" , 70000),
		new Employee (104, "Sony",    80000),
		new Employee (105, "Nani" , 40000)
		);

       Predicate<Employee> salaryCheck =
               emp -> emp.Salary > 50000;

       Employees.stream()
                .filter(salaryCheck)
                .forEach(System.out::println);
   }
}