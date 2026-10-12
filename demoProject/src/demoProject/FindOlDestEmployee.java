package demoProject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Optional;

   class FindoldEmployee {
	   
	   private int id;
	   private String name;
	   private int Age;
	   
	 
	   FindoldEmployee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.Age = age;
		
	   }
	   
	   public String getname() {
		   return name;
	   }
	   
	   public int getAge() {
		   return Age;
		   
	   }

	   @Override
	   public String toString() {
		return "FindoldEmployee [id=" + id + ", name=" + name + ", Age=" + Age + "]";
	   }
	    
   }
public class FindOlDestEmployee {
	
	// 15.  Who is the oldest employee in the organization?
	
  public static void main(String[] args) {
	  
	  List<FindoldEmployee > Employee = Arrays.asList(
			  
			  new FindoldEmployee(10, "maruthi", 26),
			  new FindoldEmployee (20, "dhanvitha", 22),
			  new FindoldEmployee (30, "nagarathana", 28),
			  new FindoldEmployee (40, "nagaraju", 44),
			  new FindoldEmployee (50, "vamshi gowd", 23),
			  new FindoldEmployee (60, "nuthan ", 33),
			  new FindoldEmployee (70, "Manjula", 52)
			  
			  );
	  
	  Optional<FindoldEmployee> FindoldestEmployee = Employee.stream()
			  .max(Comparator.comparingInt(FindoldEmployee::getAge));
	  
	  FindoldestEmployee.ifPresent(System.out::println);
  }
}
	 