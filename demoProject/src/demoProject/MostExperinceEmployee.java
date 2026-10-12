package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

   class joinedyear {
	   
	   private int id;
	   private String name;
	   private int joinedyear;
	   
	   
	   public joinedyear(int id, String name, int joinedyear) {
		this.id = id;
		this.name = name;
		this.joinedyear = joinedyear;
		
	   }
	   
	   public int getjoinedyear() {
		   return joinedyear;
	   }
	  
@Override
	public String toString() {
		return "joinedyear [id=" + id + ", name=" + name + ", joinedyear=" + joinedyear + "]";
	}

   }


public class MostExperinceEmployee {
	
	//   	9. Who has the most working experience in the organization ?
	
	public static void main(String[] args) {
		
		List<joinedyear> Employee = Arrays.asList(
				
				new  joinedyear(1, "maruthi", 2021),
				new  joinedyear (2, "dhanvitha", 2024),
				new  joinedyear (3, "nagarathna", 2023),
				new  joinedyear (4, "manjula", 2015),
				new  joinedyear (5, "nagaraju", 2010)
				
				);
		
		Employee.stream().min(Comparator.comparingInt(joinedyear::getjoinedyear))
		.ifPresent(System.out::println);
		
	}

}
