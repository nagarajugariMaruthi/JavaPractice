package string.java.preactice;

public class Vowels_consanate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str = "Hello World";
		int vowels = 0, consanate = 0;
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u') {
				
					vowels++;
			} else {
				consanate++;
			}
		}
	}

    System.out.println("Number of vowels: " + vowels);
	System.out.println("number of consanate " + consanate);
}
}
