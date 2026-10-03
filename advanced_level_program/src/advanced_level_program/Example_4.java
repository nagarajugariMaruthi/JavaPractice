package advanced_level_program;
import java.util.Scanner;
public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a program to reverse the words in a sentence.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentance: ");
		String str = sc.nextLine();
		
		String[] word = str.split("\\s+");
		
		System.out.println("Reversed the Sentance: ");
		
		for (int i = word.length -1; i >= 0; i--) {
			System.out.println(word[i]+ "");
		}
			sc.close();
		}

	}


