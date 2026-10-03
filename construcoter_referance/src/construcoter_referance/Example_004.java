package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_004 {
	
	// 4. Print only odd numbers using forEach().
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,25,35,30,40,45,55,50,80);
		
		list.forEach( x -> {
			
			if(x % 2!=0) {
				
				System.out.println(x);
			}
		});
	}
}