package method_Basic_Practice;

public class casecountconversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String str = "Java Prgramming";
	 
	 int touppercase = 2;
	 int tolowercase = 12;
	 
	 for (int i = 0; i < args.length; i++) {
		 
		 char ch = str.charAt(i);
      
		 if(Character.isUpperCase(ch)) {
		   touppercase++;
	 } else if (Character.isLowerCase(ch)) {
	      tolowercase++;
	      
	 }
	 }
	 
	 System.out.println("Print the touppercase = " +touppercase);
	 System.out.println("PRint the toulowercase = " +tolowercase);
	}
}