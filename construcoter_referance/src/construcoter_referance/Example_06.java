package construcoter_referance;

import java.util.StringJoiner;

public class Example_06 {
	
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",","[","]");
		
		sj.add("Java Developer");
		sj.add("Python Developer");
		sj.add("Automation Script");
		sj.add("manual testing ");
		sj.add("SQL Developer");
		
		System.out.println(sj);
	}

}
