package construcoter_referance;

import java.util.StringJoiner;

public class Example_08 {
	
	public static void main(String[] args) {
		
		// 7. Merge two StringJoiner objects.

		StringJoiner sj1 = new StringJoiner(",");
		
		sj1.add("java Developer");
		sj1.add("Python Developer");
		sj1.add("SQL Developer");
		
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner(",");
		
		sj2.add("Manual Testing ");
		sj2.add("Automation Testing");
		sj2.add("Ai Developer");
		
		sj1.merge(sj2);
		System.out.println(sj1);
	}
}
