package advanced_level_program;


public class Reverse_1 {
	
	public static void main(String[] args) {
		
		String str = "Maruthi";
		
		String result  = "";
		
		for (int i = str.length() -1; i>=0; i--) {
			
			 result = result + str.charAt(i);
			
		
		System.out.println("reversed String : " + result);
	}
}
}