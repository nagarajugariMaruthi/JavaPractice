package core_Java_ImportentQuestion;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {30,40,50};
		
		Set<Integer> Set = new HashSet<>();
		
		// first Array ELements Set
		
		for(int num : arr1) {
			Set.add(num);
		}
		
		for(int num : arr2) {
			
			if(Set.contains(num)) {
				
			}
			
			System.out.println("CommanElements : " + num);
			
		}

	}

}
