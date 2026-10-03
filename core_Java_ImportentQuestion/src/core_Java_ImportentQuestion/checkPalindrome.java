package core_Java_ImportentQuestion;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 2. Check whether a String is a palindrome.

      String str = "madam";
      
      boolean palindrome = true;
      
      int left = 0;
      int right = str.length() -1;
      
      while(left < right) {
    	  
    	  if(str.charAt((right)) != str.charAt(left)) {
    		  palindrome = false;
    		  break;
    	  }
    		  
      left++;
      right--;
      }
	 if(palindrome) {
		 System.out.println("it is palindrome ");
	 } else {
		 System.out.println("is not palindrome ");
	 }
	}
}