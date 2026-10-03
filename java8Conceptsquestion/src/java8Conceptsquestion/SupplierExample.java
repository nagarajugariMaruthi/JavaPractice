package java8Conceptsquestion;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> Wellcome =() -> "Well come to java Programming";
		
		System.out.println(Wellcome.get());
		

	}

}
