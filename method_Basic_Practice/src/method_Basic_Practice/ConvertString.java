package method_Basic_Practice;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/// Write a Java program to convert the following character array into a string using String.valueOf() and print the result.
	  
		char[] character = { 'J','A','V','A'};
	   
		String str = String.valueOf(character);
		
		System.out.println("Characater Arry ");
		
		for (char ch : character) {
			
			System.out.println(ch + "");
			
		}
	
	System.out.println("Converted the character Array " + str);
}
}
