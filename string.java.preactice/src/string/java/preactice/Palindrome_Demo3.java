package string.java.preactice;

public class Palindrome_Demo3 {
	    
	    public static void main(String[] args) {
	        
	        String str = "maruthi";
	        String reverse = "";
	        
	        for(int i = str.length() -1; i >=0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        
	        if(str.equals(reverse)) {
	            
	            System.out.println("palindrome String");
	        } else {
	            System.out.println("NOt a palindrome String");
	        }
	    }
	}
