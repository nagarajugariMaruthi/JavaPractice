package come_recursive_basics;

public class Chcek_String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String str = "madam";
     String revers = "";
     
     /// reverse string
     
     for(int i = str.length() -1; i>=0; i--) {
    	 revers = revers + str.charAt(i);
     }
     if (str.equals(revers)) {
    		 System.out.println("is palindrome String");
    	 } else {
    		 System.out.println("is not palindrome String");
    	 }
     }
    	 }
