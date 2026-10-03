package armStrong_numbercheck;

public class Exmple_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "programming";
   char ch = 'g';
   int count = 0;
   
   for (int i = 0; i < str.length(); i++) {
	
	   if(str.charAt(i) == ch) {
		   count++;
	   }
	   System.out.println("Occurrence of " + ch + " = " + count);
   }
}
	}
