package construcoter_referance;

import java.util.StringJoiner;

public class Example_03 {
 
	// 2. Join Strings using "," delimiter.
	 public static void main(String[] args) {
		 
		 StringJoiner sj = new StringJoiner(",");
		 
		 sj.add("java Developer");
		 sj.add("Python developer");
		 sj.add("c++ Developer");
		 sj.add("manual testing ");
		 
		 System.out.println(sj);
		 
	 }

}
