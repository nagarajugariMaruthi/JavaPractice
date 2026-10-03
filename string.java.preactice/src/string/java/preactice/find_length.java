package string.java.preactice;

public class find_length {
	
	    public static  void main(String[] args) {
	       String str = "hello";
	       int count = 0;
	       
	       try {
	           while(true) {
	               str.charAt(count);
	               count++;
	           }
	       }catch (Exception e) {
	           // end of String reached
	       }
	       System.out.println("longest of the String = " + count);
	    }
	}
	       
