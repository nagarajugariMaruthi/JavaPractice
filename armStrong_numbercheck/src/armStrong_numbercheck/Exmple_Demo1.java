package armStrong_numbercheck;

public class Exmple_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String str = "Maruthi";
		String rev = " ";
		
		for (int i = str.length() -1; i >= 0; i--) {			
			rev +=str.charAt(i);
		}
		System.out.println("Reversed String : " + rev);
	}
}
