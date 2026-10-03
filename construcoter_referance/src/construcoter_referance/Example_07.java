package construcoter_referance;

import java.util.StringJoiner;

public class Example_07 {
	
	public static void main(String[] args) {
		
		StringJoiner Employee = new StringJoiner("-");
		
		Employee.add("180773");
		Employee.add("Maruthi");
		Employee.add("60000");
		
		System.out.println(Employee);
		
		
	}

}
