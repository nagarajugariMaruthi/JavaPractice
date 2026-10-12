package lamda_EXPRESSIONS;

import java.util.StringJoiner;

public class Stringjoiner {
	
	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(", ");
		
		joiner.add("maruthi");
		joiner.add("nagarju");
		joiner.add("manjula");
		joiner.add("nagarathan");
		
		System.out.println(joiner);
	}
}
		