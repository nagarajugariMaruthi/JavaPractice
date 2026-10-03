package method_Basic_Practice;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   String  str = " dhanvith";
   
   char[] characater =str.toCharArray();
   
   System.out.println("Reversed array");
   
   for (int i = characater.length -1; i >= -0; i--) {
	System.out.println(characater[i]);
   }
	}
}