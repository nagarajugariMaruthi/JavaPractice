package armStrong_numbercheck;

import java.util.Arrays;

public class Exmple_Dem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	String str1 = "Listion";
	String str2 = "silent";
	
	char[] array1 = str1.toCharArray();
	char[] array2 = str2.toCharArray();
	
	 Arrays.sort(array1);
	 Arrays.sort(array1);
	
	   if (Arrays.equals(array1, array2)) {
           System.out.println("Anagram");
       } else {
           System.out.println("Not Anagram");
       }
	}
}