package string.java.preactice;

public class word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.println("Start small. Ship something.");
		     String str = "java is programming language";
		     int count = 1;
		     
		     for(int i = 0; i < str.length(); i++) {
		         if(str.charAt(i) == ' ') {
		             count++;
		         }
		     }
		     System.out.println("number of words = " + count);
		    }
		}
		            