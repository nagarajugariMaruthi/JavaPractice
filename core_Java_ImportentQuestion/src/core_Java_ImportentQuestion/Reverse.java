package core_Java_ImportentQuestion;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Reverse a String without using `StringBuilder.reverse()`.

		
		
		String str = "Maruthi";
		String Reverse = " ";
		
		for (int  i = str.length() -1; i >=0; i--) {
			
			Reverse = Reverse + str.charAt(i);
		}
		
		System.out.println("Originala String : " + str);
		System.out.println("Reverse string : " + Reverse);
	}
}