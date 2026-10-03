package collocation;

import java.util.ArrayList;

public class RemoveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Numbers = new ArrayList<>();
		
		
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		
		Numbers.remove(3);
		
		 for (Integer Number : Numbers) {
			 
			 System.out.println(Number);
			
		}

	}

}
