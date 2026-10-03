package construcoter_referance;

import java.util.StringJoiner;

public class Example_05 {
	
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("@");
		
		sj.add("Java Developer");
		sj.add("Python Developer");
		sj.add("Manual testing");
		sj.add("Automation testing");
		
		System.out.println(sj);
	}

}
