package construcoter_referance;

import java.util.StringJoiner;

public class Example_01 {
	
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",");
		
		sj.setEmptyValue("No Date Value");
		
		System.out.println(sj);
	}

}
