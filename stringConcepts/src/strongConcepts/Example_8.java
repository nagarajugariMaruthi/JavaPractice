package strongConcepts;
import java.util.Scanner;
public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String ");
		String str2 = sc.nextLine();
		
		System.out.println("Concatinatted "+str1.concat(str2));
		
		
		sc.close();
	}
}