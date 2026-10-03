package strongConcepts;
import java.util.Scanner;
public class Example_Countwovel_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		
		int vowels = 0, consanate = 0;
	
		for(char c : str.toCharArray()) {
			
			if(Character.isLetter(c)) {
				
				if("aeiou ".indexOf(c) !=1) {
					
					vowels++;
				}	else {
						consanate++;
					
				}
			}
			
			System.out.println("Vowels " + vowels);
			System.out.println("consanate " + consanate);
		}
	}
}