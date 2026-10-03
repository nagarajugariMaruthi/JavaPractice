package string.java.preactice;

public class String_Comparison_Demo4 {
	    public static void main(String[] args) {
	        
	        
	        String str1 = "Hello";
	        String str2 = "Hello";
	        String str3 = "world";
	        
	        
	        // using Equals()
	        System.out.println("Compare str1 and str2: " + str1.equals(str2));
	        
	    System.out.println("Compare str1 and str3: " + str1.equals(str3));
	    
	    // using compareTo()
	    System.out.println("Compareto result:" + str1.compareTo(str3));
	    }
	}
