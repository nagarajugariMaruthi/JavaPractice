package java8Conceptsquestion;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Currentdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDate> CurrentDate = () -> LocalDate.now();
		
		System.out.println("currentdate = " + CurrentDate.get());

	}

}
