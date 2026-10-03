package construcoter_referance;

import java.util.StringJoiner;

public class Example_11 {
	
	public static void main(String[] args) {
		
		StringJoiner  Students = new StringJoiner(",");
		
		Students.add("Maruthi");
		Students.add("dhanvitha");
		Students.add("nagarathan");
		Students.add("manjula");
		Students.add("nagaraju");
		Students.add("sashi");
		Students.add("Eswer Nani");
		Students.add("ammu");
		Students.add("marakka");
		Students.add(" L Manjula");
		Students.add("vannur swamy");
		
		System.out.println(Students);
	}
}
		