package construcoter_referance;

import java.util.StringJoiner;

public class Example_02 {
	
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-");

		sj.add("java");
		sj.add("python");
		sj.add("AI");
		sj.add("C++");
		
		System.out.println(sj);
	}

}
