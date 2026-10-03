package java8InterviewQuetion;

import java.util.function.Supplier;

public class Supplier_1 {
	//  Supplier
	public static void main(String[] args) {
		
		 Supplier<String> name = () -> "Hello maruthi";
		 
		 System.out.println(name.get());
	}

}
