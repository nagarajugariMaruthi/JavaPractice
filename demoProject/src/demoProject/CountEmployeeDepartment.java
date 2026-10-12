package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


class CountDepartment {
	  
	  private int id;
	  private String name;
	  private String Department;
	  
	  
	  public CountDepartment(int id, String name, String Department) {
		this.id = id;
		this.name = name;
		this.Department = Department;
	  }
	  
	  public String getDepartment() {
		  return Department;
	  }
}
public class CountEmployeeDepartment {
	
	//   6. Count the number of employees in each department ?
	public static void  main(String[] args) {
		
		List<CountDepartment> Department = Arrays.asList(
				
				new CountDepartment(11, "maruthi", "it"),
				new CountDepartment(12, "dhanvitha", "hr"),
				new CountDepartment(13, "nagarathan", "it"),
				new CountDepartment(14, "nagaraju", "hr"),
				new CountDepartment(14, "Haresh", "marketing head"),
				new CountDepartment(15, "manju", "sales manage")
				);
		
	Map<String, Long> result = Department.stream().collect(Collectors.groupingBy(CountDepartment::getDepartment,Collectors.counting()
			));
	
	System.out.println("Count the number of employees :" + result);
	}
}
