package string.java.preactice;

public class Check_id_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "madam";
		        String reverse = "";
		        
		        // Reverse the String
		        for(int i = str.length() - 1; i >= 0; i--) {
		            reverse = reverse + str.charAt(i);
		        }
		        
		        // check if original and reversed String are qual 
		        if(str.equals(reverse)) {
		            System.out.println("palindrom String");
		        } else {
		            System.out.println("not a palindrome String");
		        }
		    }
		}
	