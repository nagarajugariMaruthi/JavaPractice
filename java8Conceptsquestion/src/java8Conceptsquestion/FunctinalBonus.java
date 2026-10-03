package java8Conceptsquestion;

import java.util.function.Function;

public class FunctinalBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employ employ = new Employ(102, "Maruthi", 50000);
		
		Function<Employ, Double> bonus =
				
		         emp -> emp.Salary * 0.10;

		         double result = bonus.apply(employ);

		         System.out.println("10% Bonus = " + result);
		     }
		 }