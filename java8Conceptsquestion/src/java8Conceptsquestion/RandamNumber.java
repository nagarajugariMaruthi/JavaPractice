package java8Conceptsquestion;

import java.util.function.Supplier;

public class RandamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Integer> RandamNumber =() -> (int) (Math.random() * 100) +1;
		
		System.out.println("RandmInput = " + RandamNumber.get());
		
	}

}
