package advanced_level_program;
import java.util.Scanner;
public class Example_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter of the String ");
		int n= sc.nextInt();
		sc.nextLine();
		
		String[] str1 = new String[n];
		
		System.out.println("Enter the String ");
		
		for (int i = 0; i < n; i++) {
			
			str1[i] =sc.nextLine();
			
		}
		
		String prefix = str1[0];
		
		for (int i = 1; i < n; i++) {
			
			while(!str1[i].startsWith(prefix)) {
				
				prefix = prefix.substring(0,prefix.length()  -1);
				
				if(prefix.isEmpty()) {
					
					break;
				}
			}
		}
		
		System.out.println("Langest prefix 1" + prefix);
		
		sc.close();
	}
}
					
