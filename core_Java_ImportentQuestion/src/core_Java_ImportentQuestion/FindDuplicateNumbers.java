package core_Java_ImportentQuestion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,20,30,10,40,30,50};
		
		Set<Integer> Map = new HashSet<>();

		for (int num : arr) {
			
			if(!Map.add(num)) {
				System.out.println("Duplicate Numbers : " + num);
				
			}
			
		}
	}

}
