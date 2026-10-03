package stringInterview_imp;
import java.util.Scanner;
public class Example_3Concatinate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. How to concatenate strings?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		
		String result = str1 + str2;
		
		System.out.println("concatenated String : " + result);
		
		sc.close();
		
	}

}
