package switchcase_practice_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> List = new ArrayList<>();
		
		List.add(10);
		List.add(20);
		List.add(30);
		
		List.sort(Comparator.reverseOrder());

		System.out.println(List);
	}

}
