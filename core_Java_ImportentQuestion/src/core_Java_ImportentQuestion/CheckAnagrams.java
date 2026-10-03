package core_Java_ImportentQuestion;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "listen";
		String str2 = "silent";
		
		char[] arr1 = str1.toCharArray();
		char[]  arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("String is Anagram  ");
		} else {
			System.out.println("String is not Anagram ");
		}
	}

}
