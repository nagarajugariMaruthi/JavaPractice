package string_intermidaite_question;
import java.util.Scanner;
public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Write a program to count the number of words in a sentence
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentance");
		String sentance  = sc.nextLine();
		
		String[] word = sentance.trim().split("\\s+");
		
		int count = word.length;
		
		System.out.println("Number id words: " + count);
		
		sc.close();
	}
}
		
		
		
		
		
	