package methods_Question;

import java.util.Arrays;
import java.util.List;


public class Example_6 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"MARUTHI", "DHANVITHA", "SIDDU", "NAGARATHANA","MANJULA"
				);
		

        list.stream()
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }
}