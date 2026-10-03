package strongConcepts;
import java.util.Arrays;
import java.util.Scanner;
public class Example_Anagram_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String : ");
		String s1 = sc.nextLine().toLowerCase().replace("\\s+","");
		
		System.out.println("Enter the Second String : ");
		String s2 = sc.nextLine().toLowerCase().replace("\\s+","");
		
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2); 
		
		if(Arrays.equals(arr1, arr2)) {
			
			System.out.println("Anagram ");
		} else {
			
			System.out.println("is not Anagram ");
			
			sc.close();
		}
	}
}