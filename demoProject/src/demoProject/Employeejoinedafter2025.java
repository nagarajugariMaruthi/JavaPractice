package demoProject;

import java.util.Arrays;
import java.util.List;

class Afterjoinedyear {
	 
	   private int id;
	   private String name;
	   private int joinedyear;
	   
	   
	   public Afterjoinedyear(int id, String name, int joinedyear) {
		this.id = id;
		this.name = name;
		this.joinedyear = joinedyear;
		
	   }
	   
	   public String getname() {
		   return name;
		   
	   }
	   
	  public int getJoinedyear() {
		  return joinedyear;
		  
	  }

public class Employeejoinedafter2025 {

  // 5. Get the names of all employees who have joined after 2015 
	
	public static void main(String[] args) {
		
		List<Afterjoinedyear> Employeejoinedafter2025 = Arrays.asList(
				
		  new Afterjoinedyear(102, "Maruthi", 2015),
		  new Afterjoinedyear(102, "dhanvitha", 2027),
		  new Afterjoinedyear(105, "nagaraju", 2005),
		  new Afterjoinedyear(106, "Manjula", 2022),
		  new Afterjoinedyear(107, "Nagarathan", 2024)
		  
		  );
		
		Employeejoinedafter2025.stream().filter(e -> e.getJoinedyear() > 2015).map(Afterjoinedyear::getname).forEach(System.out::println);
	}
}
}