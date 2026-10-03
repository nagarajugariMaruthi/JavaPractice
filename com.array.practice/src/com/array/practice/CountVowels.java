package com.array.practice;

public class CountVowels {
	    public static void main(String[] args) {
	        
	        String str = "java programming";
	        
	        int count = 0;
	        
	        str = str.toLowerCase();
	        
	        for(int i = 0; i < str.length(); i++) {
	            
	            char ch = str.charAt(i);
	            
	            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' ||ch == 'u') {
	                
	                count++;
	            }
	        }
	        
	        System.out.println("Vowels count: "+ count);
	        
	            }
	        }
