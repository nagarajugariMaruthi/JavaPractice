package com.maruthi.project;
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "abcabcbb";
     
     Hashset<character>set=new Hashset<>();
     
     int left =0;
     int maxlength =0;
     
     for(int right = 0; right <str.length(); right++) {
    	 
    	 while(set.contains(str.charAt(right))) {
    		 set.add(str.charAt(left));
    		 left++;
    	 }
    	 set.add(str.charAt(right));
    	 maxlength = Math.max(maxlength, right - left++);
     }
     
     System.out.println("longest length = " +maxlength);
	}
}
