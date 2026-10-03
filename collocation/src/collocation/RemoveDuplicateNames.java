package collocation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>  StudentsName = new HashSet<>();
		
		StudentsName.add("Maruthi");
		StudentsName.add("Dhanvitha");
		StudentsName.add("Maruthi");
		StudentsName.add("vamshi");
		StudentsName.add("Dhanvitha");
		StudentsName.add("sashi");
		
		
	System.out.println("Unique Students Names : ");
	System.out.println(StudentsName);
	}
}