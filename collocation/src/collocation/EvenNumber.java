package collocation;

import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> Numbers = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
		       
			Numbers.add(i);
			
		}

	for (Integer Number: Numbers) {
		
		if(Number % 2 ==0) {
			System.out.println(Number);
			
		}
	}
	}
}