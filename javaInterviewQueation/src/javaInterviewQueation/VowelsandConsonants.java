package javaInterviewQueation;

public class VowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java Programming";
		
		int VowelsCount = 0;
		int Consanate = 0;
		
		str.toLowerCase();
		
		for(char ch : str.toCharArray()) {
			
			if(ch >= 'a' && ch <= 'z') {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					
					VowelsCount++;
				} else {
					Consanate++;
				}
			}
		}
				
				System.out.println("Vowels Count " + VowelsCount);
				System.out.println("Consanate " + Consanate);
			}
		}
	