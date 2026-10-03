package collocation;

import java.util.ArrayList;

public class CheckElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> Students = new ArrayList<>();
		
		Students.add("Maruthi");
		Students.add("Dhanvitha");
		Students.add("Nagarathan");
		Students.add("sashi");
		Students.add("Nani");
		Students.add("Sahasra");
		
		
		if(Students.contains("Dhanvitha")) {
			System.out.println("Dhanvitha is present in the Collocation  ");
		} else {
			System.out.println("Dhanvitha is not present in the Collocation : ");
		}
	}

}
