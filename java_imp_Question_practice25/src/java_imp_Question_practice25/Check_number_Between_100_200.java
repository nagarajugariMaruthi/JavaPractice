package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_number_Between_100_200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num >=100 && num <=200) {
	System.out.println("the number line between 100 to 200.");
		} else {
			System.out.println("the number does not between to 100 to 200.");
		}

	}

}
