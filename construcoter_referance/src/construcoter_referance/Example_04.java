package construcoter_referance;

import java.util.StringJoiner;

public class Example_04 {
  // 3. Join Strings using ":" delimiter.
	
	public static void main(String[] args) {
	
	 StringJoiner sj = new StringJoiner(":");
	 
	 sj.add("java Developer");
	 sj.add("Python Developer");
	 sj.add("Manual testing");
	 sj.add("c++ Developer");
	 sj.add("Automation Script");
	 
	 System.out.println(sj);
}
}
