package method_Basic_Practice;

public class Formating_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   double value = 3256.99;
   
   // formart  value of tow decemal 
   String result = String.format("%.2f",value);
   
   System.out.println("Format Value : "+ result);
	}
}
