package collectionProject;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyofeachcharactercount {

	// 12. Count the frequency of each character.
	
	public static void main(String[] args) {
		
		String str = "maruthi";
		
		Map<Character, Long> frequency = str.chars()
				.mapToObj(c -> (char) c)
				 .collect(Collectors.groupingBy(
						 Function.identity(),
						 Collectors.counting()
						 ));
				 System.out.println(frequency);
						 
	}
}
