package construcoter_referance;

import java.util.Iterator;
import java.util.function.IntFunction;

public class Example_9 {
	
	public static void main(String[] args) {
		
		IntFunction<String[]> f = String[]::new;
		
		String[] names = f.apply(10);
		
		
		names[0] = "maruthi";
		names[1] = "dhanvith";
		names[2] = "sony";
		names[3] = "nani";
		names[4] = "nagaraju";
		names[5] = "vamshi";
		names[6] = "manjula";
		names[7] = "sahasra";
		names[8] = " sashi";
		names[9] = "vannur swamy";
		
		
	for (String name : names) {
		
		System.out.println(name);
		
	}
	}
}