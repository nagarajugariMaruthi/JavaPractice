package lamda_EXPRESSIONS;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamApi_19 {
	
	// 19. Find numbers starting with 1.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,120,240,30);
		
		   list.stream()
		   .map(String::valueOf)
		   .filter(n -> n.startsWith("1"))
		   .forEach(n-> System.out.println(n));
	}

}
