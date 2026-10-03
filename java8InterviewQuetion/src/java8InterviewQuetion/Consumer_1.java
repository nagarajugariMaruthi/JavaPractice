package java8InterviewQuetion;

import java.util.function.Consumer;

public class Consumer_1 {
	
	// Consumer 
	public static void main(String[] args) {
		
		Consumer<String> c = name -> System.out.println("Hellu " + name);
		
		c.accept("maruthi");
	}

}
