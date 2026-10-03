package java8Conceptsquestion;

import java.util.function.Consumer;

public class ConsumerString {

	// 1. Write a Java 8 program using `Consumer<String>` to **print a String**.
	
	 public static void main(String[] args) {
		 
		 Consumer<String> printString =
				 
				 str -> System.out.println(str);
				 
				 printString.accept("Hello Maruthi");
	 }
}
