package armStrong_numbercheck;

public class Exmple_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "nagaraju";
   char ch = 'a';
   int count = 0;
   
   for (int i = 0; i < str.length(); i++) {
	 
	   if(str.charAt(i) == ch) {
		   count++;
	   }
	   System.out.println("accurence of" + ch + " = " + count);
	   }
}
}