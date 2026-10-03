package java_imp_Question_practice25;
import java.util.Scanner;
public class Vowels_consanate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the character ");
	char ch = sc.next().charAt(0);
	
	if(ch == 'a'||ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch =='a' ||ch == 'e'||ch =='e' || ch =='i' ||ch =='o' ||ch =='u') {
	System.out.println("is vowels." + ch);
	}
	 else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		System.out.println("is consanate" + ch);
	 }
	 else {
		 System.out.println("Invalid input! please Enter the alphabets");
	 }
	sc.close();
		 
	}
	}
