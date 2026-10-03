package method_Basic_Practice;

public class conversationtocharry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String str = "dhanvith";
	 
	 
	 char[] character = str.toCharArray();
	 
	 int count = 0;
	 
	 for (char ch : character) {
		
	  if(ch == 'd' || ch == 'h' || ch == 'a' || ch == 'n' || ch == 'v' || ch == 'i' || ch == 't' || ch == 'h') {
		  
		  count++;
		  
	  }
	 }
	 
  System.out.println("Original word = " + str);
  System.out.println("Number of vowels = " + count);
	}
}