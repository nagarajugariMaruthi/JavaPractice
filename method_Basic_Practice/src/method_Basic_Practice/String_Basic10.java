package method_Basic_Practice;
import java.util.Scanner;
public class String_Basic10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the String ");
		String text = sc.nextLine();
		
		char[] characters = text.toCharArray();
		
		System.out.println("character is array ");
	
		for(char ch : characters) {
			System.out.println(characters);
		}
		
   sc.close();
   
	}
}
