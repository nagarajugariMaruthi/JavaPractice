package collocation;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Students = new ArrayList<>();
		
		Students.add("Maruthi");
		Students.add("Dhanvitha");
		Students.add("Sunil");
		Students.add("siddu");
		Students.add("Curle Vanni");
		
		
		for (String Student : Students) {
			
			System.out.println(Student);
			
		}

	}

}
