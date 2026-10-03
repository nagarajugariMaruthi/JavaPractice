package construcoter_referance;

import java.util.StringJoiner;

public class Example_09 {
	
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",");
		
		sj.add("java");
		sj.add("Python");
		sj.add("Sql");
		sj.add("Ai");
		
		System.out.println(sj.length());
	}

}
