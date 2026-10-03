package java_imp_Question_practice25;
import java.util.Scanner;
public class Uppercase_Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the charater number");
         char ch = sc.next().charAt(0);
     if(ch >= 'A' && ch <= 'Z' ) {
    	 System.out.println("is the uppercase Latter" + ch);
     } 
     else if( ch >= 'a' && ch <= 'z') {
    	 System.out.println("is the lowercase Latter" +  ch);
     } else {
    	 System.out.println("Invalid input! please Enter the alphabeta");
     }
     sc.close();
	}
}
   