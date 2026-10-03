package collocation;

import java.util.ArrayList;

import java.util.Iterator;

public class Students {
	
	public static void main(String[] args) {
		
		// Creat ArrayList
		ArrayList<String> Students = new ArrayList<>();
		
		// creat Students
		Students.add("MAruthi");
		Students.add("dhanivitha");
		Students.add("Nani");
		Students.add("sahasra");
		Students.add("Nagarathan");
		Students.add("sashi");
		
		for (String names : Students) {
			
			System.out.println(names);
		}
	}
}