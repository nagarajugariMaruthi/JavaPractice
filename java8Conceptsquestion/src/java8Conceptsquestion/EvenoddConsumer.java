package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class EvenoddConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(10,15,20,25,30);
		
		 Consumer<Integer> checkEvenodd = Numbers ->  {
			
			if(Numbers % 2 == 0) {
				System.out.println(numbers + "is Even");
			} else {
				
				System.out.println(numbers + "is odd");
			}
		};
		
		numbers.forEach(checkEvenodd);
	}
}
